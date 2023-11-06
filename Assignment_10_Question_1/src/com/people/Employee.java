package com.people;

import java.util.Scanner;

import com.customexceptionhandler.EmployeeException;

public abstract class Employee extends Person {

	private int id;
	private double salary;
	
	public Employee() {
	}

	public Employee(int id, double salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	
	public void accept(Scanner sc) throws EmployeeException{
		super.accept(sc);
		System.out.println("Enter Id: ");
		this.setId(sc.nextInt());
		System.out.println("Enter Salary: ");
		this.setSalary(sc.nextDouble());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) throws EmployeeException{
		if(salary <= 0) {
			throw new EmployeeException("Salary", salary );
		}
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder s1 = new StringBuilder();
		s1.append("Employee [name= " + this.getName() + ", age= " + this.getAge() + ", id= " + id + ", salary= " + salary + "]");
		return s1.toString();
	}
	
	public abstract double calcSalary() throws EmployeeException;
	
}
