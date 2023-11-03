package com.employee;

public class Manager implements Emp {

	double basicSalary;
	double dearanceAllowance;
	
	public Manager() {
	}
	
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary + dearanceAllowance;
	}
	
	@Override
	public double calcIncentives() {
		//20% of basicSalary
		return 0.2*basicSalary;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [basicSalary=").append(basicSalary).append(", dearanceAllowance=")
				.append(dearanceAllowance).append("]");
		return builder.toString();
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}	
}
