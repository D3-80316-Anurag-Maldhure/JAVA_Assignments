package com.ecorp.office;

import java.util.Scanner;
import com.ecorp.exception.EmployeeException;
import com.ecorp.util.SkipLine;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this.name = "";
		this.age = 18;
	}
	
	public Person(String name, int age) {
		this.name = name;
		if(age < 18)
			throw new EmployeeException("age", age);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age < 18)
			throw new EmployeeException("age", age);
		this.age = age;
	}
	
	public void accept(Scanner sc) {
		SkipLine.skipNextLine(sc);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		this.name = name;
		
		if(age < 18)
			throw new EmployeeException("age", age);
		this.age = age;
		
	}

	@Override
	public String toString() {
		return String.format("Name: %s\nAge: %d", this.name, this.age);
	}
}
