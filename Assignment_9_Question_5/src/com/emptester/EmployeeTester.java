package com.emptester;

import java.util.Scanner;

import com.customexceptionhandler.EmployeeException;
import com.people.*;

public class EmployeeTester {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		Employee [] team = new Employee[3];
		team[0] = new Clerk();
		team[0].accept(sc);
		System.out.println(team[0].toString());
		team[1] = new Salesman();
		team[1].accept(sc);
		System.out.println(team[1].toString());
		team[2] = new Labor();
		team[2].accept(sc);
		System.out.println(team[2].toString());
		
		
		System.out.println("Average Salary of All Emp : " + EmployeeHelper.averageAllEmployee(team)); 
		System.out.println("Average Salary of Clerks : " + EmployeeHelper.averageClerk(team));
		System.out.println("Average Salary of Labor: " + EmployeeHelper.averageLabor(team));
		System.out.println("Average Salary of Salesman : " + EmployeeHelper.averageSalesman(team));
		}
		catch(EmployeeException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
