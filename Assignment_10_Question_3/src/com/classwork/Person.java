package com.classwork;

public class Person implements Displayable{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// ...
	@Override
	public void display() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
