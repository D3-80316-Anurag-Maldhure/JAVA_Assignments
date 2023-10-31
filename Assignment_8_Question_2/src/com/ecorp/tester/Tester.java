package com.ecorp.tester;

import java.util.Scanner;
import com.ecorp.exception.EmployeeException;
import com.ecorp.office.*;
import com.ecorp.util.*;

public class Tester {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Employee[] employeeRecord = new Employee[5];
		try {
			employeeRecord[0] = new Labor();
			employeeRecord[0].accept(sc);
			
			employeeRecord[1] = new Salesman();
			employeeRecord[1].accept(sc);
			
			employeeRecord[2] = new Clerk();
			employeeRecord[2].accept(sc);
			
			System.out.println("Average salary of labour: " + Employees.averageSalLabor(employeeRecord));
			System.out.println("Average salary of salesman: " + Employees.averageSalSalesman(employeeRecord));
			System.out.println("Average salary of clerk: " + Employees.averageSalClerk(employeeRecord));
		}
		catch(EmployeeException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
