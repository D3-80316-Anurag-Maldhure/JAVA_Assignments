package com.employee;

public interface Emp {
	
	public double getSal();
	
	default double calcIncentives() {
		return 0.0;
	}
	
	//calculate total income (salary + incentives) of all employees in the given array.
	static double calcTotalIncome(Emp arr[]) {
		double totalIncome = 0;
		for(Emp e : arr) {
			totalIncome = totalIncome + e.getSal()+e.calcIncentives();
		}	
		return totalIncome;
	}
}
