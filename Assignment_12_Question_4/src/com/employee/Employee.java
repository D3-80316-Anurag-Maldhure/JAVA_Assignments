package com.employee;

import java.util.Scanner;

public class Employee{
	int empId;
	String firstName;
	String lastName;
	String department;
	double salary;
	
	public Employee() {
		this.empId = 0000;
		this.firstName = "TempFN";
		this.lastName = "TempLN";
		this.department = "ToBeAssigned";
		this.salary = 0000;
	}
	
	public Employee(int empId, String firstName, String lastName, String department, double salary) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salary = salary;
	}
	
	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee details :");
		System.out.println("Enter id: ");
		this.empId = sc.nextInt();
		System.out.println("Enter first name: ");
		this.firstName = sc.next();
		System.out.println("Enter last name: ");
		this.lastName = sc.next();
		System.out.println("Enter department name: ");
		this.department = sc.next();
		System.out.println("Enter salary: ");
		this.salary = sc.nextDouble();
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", department=").append(department).append(", salary=").append(salary)
				.append("]");
		return builder.toString();
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
