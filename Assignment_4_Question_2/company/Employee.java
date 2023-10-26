package com.company;

public abstract class Employee {
	String firstName;
	String lastName;
	int SSN; //Social Security Number
	double totalEarnings;
	
	public Employee() {
	}
	
	public Employee(String firstName, String lastName, int sSN, double totalEarnings) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		SSN = sSN;
		this.totalEarnings = totalEarnings;
	}
	
	public abstract void earnings();
	public abstract String toString();
	public abstract void incrementBaseSalaryBy10Percent();

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final int getSSN() {
		return SSN;
	}

	public final void setSSN(int sSN) {
		SSN = sSN;
	}

	public final double getTotalEarnings() {
		return totalEarnings;
	}

	public final void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
	
	
}
