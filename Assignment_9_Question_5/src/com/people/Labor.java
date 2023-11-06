package com.people;

import java.util.Scanner;

import com.customexceptionhandler.EmployeeException;

public class Labor extends Employee {

	private int rate;
	private int hours;
	
	public Labor() {
	}
	
	public Labor(int rate, int hours) {
		super();
		this.rate = rate;
		this.hours = hours;
	}
	
	public Labor(int id, double salary, int rate, int hours) {
		super(id, salary);
		this.rate = rate;
		this.hours = hours;
	}

	public Labor(String name, int age, int id, double salary, int rate, int hours) {
		super(name, age, id, salary);
		this.rate = rate;
		this.hours = hours;
	}

	public void accept(Scanner sc) throws EmployeeException{
		super.accept(sc);
		System.out.println("Enter Hourly Rate: ");
		this.setRate(sc.nextInt());
		System.out.println("Enter hours Worked: ");
		this.setHours(sc.nextInt());
		try {
			this.calcSalary();
		}
		catch(EmployeeException e){
			System.out.println("Error : " + e.getMessage());
		}
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		if(rate <= 0) {
			new EmployeeException("Rate", rate );
		}
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) throws EmployeeException{
		if(hours <= 0) {
			new EmployeeException("hours", hours );
		}
		this.hours = hours;
	}

	@Override
	public double calcSalary() throws EmployeeException {
		this.setSalary(this.hours*this.rate);
		if(this.getSalary() < 0) {
			throw new EmployeeException("Salary", this.getSalary());
		}
		return this.getSalary();
	}

	@Override
	public String toString() {
		return String.format("Labor [name= %s, age= %d, id= %d, Rate= %d, Hours= %d, salary= %f\n",  this.getName(), this.getAge(), this.getId(), this.rate, this.hours, this.getSalary());
	}
	
}
