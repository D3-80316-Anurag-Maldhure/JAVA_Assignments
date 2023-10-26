package com.company;

public class BasePlusCommissionEmployee extends Employee{
	double grossSales;
	double commissionRate;
	double baseSalary;
	
	public BasePlusCommissionEmployee() {
		super();
	}

	public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}

	@Override
	public void incrementBaseSalaryBy10Percent() {
		System.out.println("Total earnings = "+ ((commissionRate*grossSales)+baseSalary));
		double newSalary = 1.1*baseSalary;
		System.out.println("New Salary (10% incremented): "+ newSalary);
		this.totalEarnings = ((commissionRate*grossSales)+newSalary);
		System.out.println("Total earnings after 10% increase in base Salary: "+ this.totalEarnings);
	}

	@Override
	public void earnings() {
		System.out.println("Total earnings = "+ this.totalEarnings);
	}

	@Override
	public String toString() {
		return "Employee type: "+getClass()+" First name: "+ firstName
				+" Last name: "+ lastName + " SSN: "+SSN + 
				" Gross Sales: "+grossSales + " Commission Rate: " +commissionRate
				+ " Base Salary: "+baseSalary;
	}
}
