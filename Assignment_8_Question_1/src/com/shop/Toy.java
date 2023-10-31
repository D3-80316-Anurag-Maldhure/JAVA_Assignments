package com.shop;

import java.util.Scanner;
import com.shop.util.Util;

public class Toy extends Shop {
	private String ageGroup;
	private String type;
	private static double vat = 5;
	
	public Toy() {
		super();
		this.ageGroup = "";
		this.title = "";
	}
	
	public Toy(String title, double price, String ageGroup, String type) {
		super(title, price);
		this.ageGroup = ageGroup;
		this.type = type;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public String getType() {
		return type;
	}
	
	public static void setVat(double vat) {
		if(vat < 0)
			throw new RuntimeException("VAT cannot be negative!!");
		else
			Toy.vat = vat;
	}

	@Override
	public double totalCost() {
		if(discount == 0)
			return (price + (price * Toy.vat/100));
		else
			return ((price - (price * discount/100)) + ((price - (price * discount/100)) * Toy.vat/100));
	}

	@Override
	public double costWithoutTax() {
		if(discount == 0)
			return price;
		else
			return (price - (price * discount/100));
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		
		Util.skipnextLine(sc);
		System.out.print("Enter Age group: ");
		String ageGroup = sc.nextLine();
		
		System.out.print("Enter Type: ");
		String type = sc.nextLine();
		
		this.ageGroup = ageGroup;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nAge Group: %s\nType: %s\n", super.toString(), this.ageGroup, this.type);
	}
}
