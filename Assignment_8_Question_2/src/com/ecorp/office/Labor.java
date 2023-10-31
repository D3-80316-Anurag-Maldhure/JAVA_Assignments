package com.ecorp.office;

import java.util.Scanner;
import com.ecorp.exception.EmployeeException;

public class Labor extends Employee{
	private double rate;
	private double hours;
	
	public Labor() {
		super();
		this.rate = 1;
		this.hours = 1;
	}

	public Labor(String name, int age, int id, double rate, double hours) {
		super(name, age, id);
		
		if(rate <= 0)
			throw new EmployeeException("rate", rate);
		this.rate = rate;
		
		if(hours <= 0)
			throw new EmployeeException("hours", hours);
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public double getHours() {
		return hours;
	}

	public void setRate(double rate) {
		if(rate <= 0)
			throw new EmployeeException("rate", rate);
		this.rate = rate;
	}

	public void setHours(double hours) {
		if(hours <= 0)
			throw new EmployeeException("hours", hours);
		this.hours = hours;
	}
	
	@Override
	public double calcSalary() {
		return (rate * hours);
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		
		System.out.print("Enter rate: ");
		double rate = sc.nextDouble();
		
		if(rate <= 0)
			throw new EmployeeException("rate", rate);
		this.rate = rate;
		
		System.out.print("Enter hours: ");
		double hours = sc.nextDouble();
		
		if(hours <= 0)
			throw new EmployeeException("hours", hours);
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nRate: %.2f\nHours: %.2f", super.toString(), this.rate, this.hours);
	}
}
