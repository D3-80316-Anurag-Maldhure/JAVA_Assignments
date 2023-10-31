package com.shop;

import java.util.Scanner;
import com.shop.util.Util;

public abstract class Shop {
	protected String title;
	protected double price;
	protected static double discount = 0;
	
	public Shop() {
		this.title = "";
		this.price = 0.0;
	}
	
	public Shop(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
	
	public static void setDiscount(double discount) {
		if(discount < 0) {
			throw new RuntimeException("Discount cannot be negative!!");
		}
		else {
			Shop.discount = discount;
		}
	}
	
	public abstract double totalCost();
	
	public abstract double costWithoutTax();

	public void accept(Scanner sc) {
		Util.skipnextLine(sc);
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		
		System.out.print("Enter price: ");
		double price = sc.nextDouble();
		
		this.title = title;
		
		if(price <= 0)
			throw new RuntimeException("Price cannot be zero or negative!!");
		else
			this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Title: %s\nPrice: %.2f", this.title, this.price);
	}
}
