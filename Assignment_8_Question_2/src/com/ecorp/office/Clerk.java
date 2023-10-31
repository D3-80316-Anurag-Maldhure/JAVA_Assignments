package com.ecorp.office;

import java.util.Scanner;

public class Clerk extends Employee {
	public Clerk() {
		super();
	}

	public Clerk(String name, int age, int id, double salary) {
		super(name, age, id, salary);
	}

	@Override
	public double calcSalary() {
		return salary;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}

	@Override
	public String toString() {
		return String.format("%s", super.toString());
	}
}
