package com.Person;

import java.util.Scanner;

public class Person {
	
	String name;
	int age;
	Gender gender;

	enum Gender{
		Male, Female;
	}
	
	enum Functionalities{
		EXIT, AddNewPerson, DisplayAllPeople, FindAPersonByName;
	}
	
	public Person() {
	}	
	
	public Person(String name, int age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final Gender getGender() {
		return gender;
	}

	public final void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void acceptPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person name : ");
		setName(sc.next());
		System.out.println("Enter person age : ");
		setAge(sc.nextInt());
		System.out.println("Enter person gender : 0 for Male and 1 for Female");
		Gender f = Gender.values()[sc.nextInt()];
		setGender(f);
		System.out.println(getAge());
	}
	
	//OR
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append("]");
		return builder.toString();
	}	
	
}

