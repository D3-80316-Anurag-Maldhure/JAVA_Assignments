package com.company;

public class HourlyEmployee extends Employee{
	double wage; //Hourly wage
	double hours; //hours worked
	
	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(double wage, double hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public void incrementBaseSalaryBy10Percent() {
		System.out.println("Not Applicable");
	}
	
	@Override
	public void earnings() {
		double totalEarnings = 0;
		
		if(hours <= 40) {
			totalEarnings = wage*hours;
		}
		else if(hours > 40){
			totalEarnings = 40 * wage + (hours-40) * wage * 1.5;
		}
		System.out.println("Total earnings = "+totalEarnings);
	}
	
	@Override
	public String toString() {
		return "Employee type: "+getClass()+" First name: "+ firstName
				+" Last name: "+ lastName + " SSN: "+SSN + " Wage: "+SSN +
				" Hours: " +hours;
	}
}
