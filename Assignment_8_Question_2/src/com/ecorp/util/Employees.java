package com.ecorp.util;

import com.ecorp.office.*;

public class Employees {
	public static double averageSalLabor(Employee[] employeeRecord) {
		double averageLaborSalary = 0;
		int laborCounter = 0;
		for(Employee e : employeeRecord) {
			if(e == null)
				break;
			if(e instanceof Labor) {
				averageLaborSalary = averageLaborSalary + e.calcSalary();
				laborCounter++;
			}
		}
		return (averageLaborSalary/laborCounter);
	}
	
	public static double averageSalSalesman(Employee[] employeeRecord) {
		double averageSalesmanSalary = 0;
		int salesmanCounter = 0;
		for(Employee e : employeeRecord) {
			if(e == null)
				break;
			if(e instanceof Salesman) {
				averageSalesmanSalary = averageSalesmanSalary + e.calcSalary();
				salesmanCounter++;
			}
		}
		return (averageSalesmanSalary/salesmanCounter);
	}
	
	public static double averageSalClerk(Employee[] employeeRecord) {
		double averageClerkSalary = 0;
		int clerkCounter = 0;
		for(Employee e : employeeRecord) {
			if(e == null)
				break;
			if(e instanceof Clerk) {
				averageClerkSalary = averageClerkSalary + e.calcSalary();
				clerkCounter++;
			}
		}
		return (averageClerkSalary/clerkCounter);
	}
}
