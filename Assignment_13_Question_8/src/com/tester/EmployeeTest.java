package com.tester;

import com.employee.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Emp[] empList = new Emp[6];
		
		Emp e1 = new Manager(40000, 5000);
		empList[0] = e1;
		Emp e2 = new Labor(50, 500);
		empList[1] = e2;
		Emp e3 = new Clerk(20000);
		empList[2] = e3;
		Emp e4 = new Manager(45000, 5000);
		empList[3] = e4;
		Emp e5 = new Labor(48, 600);
		empList[4] = e5;
		Emp e6 = new Clerk(23000);
		empList[5] = e6;
	
		System.out.println("----------------------------------");
		System.out.println("List of all Employees :");
		for(Emp e : empList) {
			System.out.println(e);
		}
		System.out.println("----------------------------------------------------------------------- ");
		System.out.println("Total income (salary + incentives) of all employees in the given array :");
		System.out.println(Emp.calcTotalIncome(empList));
	}

}
