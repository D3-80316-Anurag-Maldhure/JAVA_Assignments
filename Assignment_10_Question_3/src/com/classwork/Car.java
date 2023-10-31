package com.classwork;

public class Car implements Displayable{
	private String name;
	private double price;
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// ...
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
}
