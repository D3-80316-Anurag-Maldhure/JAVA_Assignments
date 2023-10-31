package com.ecorp.office;

import java.util.Scanner;
import com.ecorp.exception.EmployeeException;


public abstract class Employee extends Person{
	private int id;
	protected double salary;
	
	public Employee() {
		super();
		this.id = 1001;
		this.salary = 100;
	}
	
	public Employee(String name, int age, int id) {
		super(name, age);
		
		if(id <= 0)
			throw new EmployeeException("id", id);
		this.id = id;
	}
	
	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		
		if(id <= 0)
			throw new EmployeeException("id", id);
		this.id = id;
		
		if(salary <= 0)
			throw new EmployeeException("salary", salary);
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		if(id <= 0)
			throw new EmployeeException("id", id);
		this.id = id;
	}

	public void setSalary(double salary) {
		if(salary <= 0)
			throw new EmployeeException("salary", salary);
		this.salary = salary;
	}
	
	
	//abstract method
	public abstract double calcSalary();
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		
		System.out.print("Enter id: ");
		int id = sc.nextInt();
		
		if(id <= 0)
			throw new EmployeeException("id", id);
		this.id = id;
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
				
		if(salary <= 0)
			throw new EmployeeException("salary", salary);
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nId: %d\nSalary: %.2f", super.toString(), this.id, this.salary);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		
		if(this == obj)
			return true;
		
		if(!(obj instanceof Employee))
			return false;
		
		Employee other = (Employee) obj;
		if(this.id == other.id)
			return true;
		
		return false;
	}
}
