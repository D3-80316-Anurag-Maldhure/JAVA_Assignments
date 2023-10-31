package com.classwork;

public class Book implements Displayable{
	private String name;
	private double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// ...
	@Override
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}
