package com.people;

import java.util.Scanner;

import com.customexceptionhandler.EmployeeException;

public class Person {

	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void accept(Scanner sc) throws EmployeeException {
		System.out.println("Enter Name: ");
		this.setName(sc.next());
		System.out.println("Enter Age: ");
		this.setAge(sc.nextInt());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws EmployeeException {
		if(age < 18 || age > 58) {
			throw new EmployeeException("Age", age );
		}
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder s1 = new StringBuilder();
		s1.append("Person [name= " + this.name + ", age= " + this.age + "]");
		return s1.toString();
	}		
}
