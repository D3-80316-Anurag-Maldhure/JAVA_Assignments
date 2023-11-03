package com.student;

import java.util.Scanner;

public class Student {
	int roll;
	String firstName;
	String lastName;
	double height;
	
	public Student() {		
	}
	
	public Student(int roll, String firstName, String lastName, double height) {
		this.roll = roll;
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
	}
	
	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student details: ");
		System.out.println("Enter roll number: ");
		setRoll(sc.nextInt());
		System.out.println("Enter first name : ");
		setFirstName(sc.next());
		System.out.println("Enter last name : ");
		setLastName(sc.next());
		System.out.println("Enter height : ");
		setHeight(sc.nextDouble());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [roll=").append(roll).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", height=").append(height).append("]");
		return builder.toString();
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(roll);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Student))
//			return false;
//		Student other = (Student) obj;
//		return roll == other.roll;
//	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}	
}
