package com.people;

import java.util.Scanner;

import com.customexceptionhandler.EmployeeException;

public class Clerk extends Employee {

	public Clerk() {
	}
	
	public Clerk(int id, double salary) {
		super(id, salary);
	}
	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
	}

	public void accept(Scanner sc)throws EmployeeException {
		super.accept(sc);
	}
	
	@Override
	public double calcSalary() {
		return this.getSalary();
	}

	@Override
	public String toString() {
		return String.format("Clerk [name= %s, age= %d, id= %d, salary= %f\n", this.getName(), this.getAge(), this.getId(), this.getSalary());
	}
}
