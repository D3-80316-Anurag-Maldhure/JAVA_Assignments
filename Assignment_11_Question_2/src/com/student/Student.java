package com.student;

import java.util.Scanner;

public class Student {
	private int roll;
    private String name;
    private String city;
    private double marks;
    
	public Student() {
		this.roll = 0;
		this.name = "Temp name";
		this.city = "Temp City";
		this.marks = 0.00;
	}
	
	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number : ");
		setRoll(sc.nextInt());
		System.out.println("Enter name : ");
		setName(sc.next());
		System.out.println("Enter city : ");
		setName(sc.next());
		System.out.println("Enter marks : ");
		setMarks(sc.nextDouble());
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [roll=").append(roll).append(", name=").append(name).append(", city=").append(city)
				.append(", marks=").append(marks).append("]");
		return builder.toString();
	}
    
}
