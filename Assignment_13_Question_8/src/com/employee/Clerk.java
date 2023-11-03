package com.employee;

public class Clerk implements Emp{
	double salary;

	public Clerk() {
	}
	
	public Clerk(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Clerk [salary=").append(salary).append("]");
		return builder.toString();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
