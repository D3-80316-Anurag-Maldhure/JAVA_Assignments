package com.company;

public class SalariedEmployee extends Employee{
	double weeklySalary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	@Override
	public void incrementBaseSalaryBy10Percent() {
		System.out.println("Not Applicable");
	}

	@Override
	public void earnings() {
		System.out.println("Total earnings = "+weeklySalary);
	}

	@Override
	public String toString() {
		return "Employee type: "+getClass()+" First name: "+ firstName
				+" Last name: "+ lastName + " SSN: "+SSN;			
	}
	
}

