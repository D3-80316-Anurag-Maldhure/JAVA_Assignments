package com.company;

public class CommissionEmployee extends Employee{
	double grossSales;
	double commissionRate;
	
	public CommissionEmployee() {
		super();
	}

	public CommissionEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public void incrementBaseSalaryBy10Percent() {
		System.out.println("Not Applicable");
	}
	
	
	@Override
	public String toString() {
		return "Employee type: "+getClass()+" First name: "+ firstName
				+" Last name: "+ lastName + " SSN: "+SSN + 
				" Gross Sales: "+grossSales + " Commission Rate: " +commissionRate;
	}

	@Override
	public void earnings() {
		System.out.println("Total earnings = "+commissionRate*grossSales);
	}
}
