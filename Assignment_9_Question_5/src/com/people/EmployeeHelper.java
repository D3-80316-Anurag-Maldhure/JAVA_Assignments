package com.people;

public class EmployeeHelper {

	public static double averageAllEmployee(Employee [] team) {
		int i = 0;
		double totalSalary = 0;
		for(Employee e:team) {
			if(e instanceof Labor) {
				Labor l = (Labor)e;
				totalSalary = totalSalary + l.getSalary();
				i++;
			}else if(e instanceof Salesman) {
				Salesman s = (Salesman)e;
				totalSalary = totalSalary + s.getSalary();
				i++;
			}else if(e instanceof Clerk) {
				Clerk c = (Clerk)e;
				totalSalary = totalSalary + c.getSalary();
				i++;
			}else {
				
			}
		}
		return totalSalary/i;
	}
	
	public static double averageLabor(Employee[] team) {
		int i = 0;
		double totalSalary = 0;
		for(Employee e:team) {
			if(e instanceof Labor) {
				Labor l = (Labor)e;
				totalSalary = totalSalary + l.getSalary();
				i++;
			}else {
				
			}
		}
		return totalSalary/i;

	}
	
	public static double averageSalesman(Employee [] team) {
		int i = 0;
		double totalSalary = 0;
		for(Employee e:team) {
			if(e instanceof Salesman) {
				Salesman s = (Salesman)e;
				totalSalary = totalSalary + s.getSalary();
				i++;
			}else {
				
			}
		}
		return totalSalary/i;
	}
	
	public static double averageClerk(Employee [] team) {
		int i = 0;
		double totalSalary = 0;
		for(Employee e:team) {
			if(e instanceof Clerk) {
				Clerk c = (Clerk)e;
				totalSalary = totalSalary + c.getSalary();
				i++;
			}else {
				
			}
		}
		return totalSalary/i;
	}
}