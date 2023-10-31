package com.shop;

import java.util.Scanner;
import com.shop.util.Util;

public class Album extends Shop {
	private String singer;
	private String musician;
	private static double gst = 10;
	
	public Album() {
		super();
		this.singer = "";
		this.musician = "";
	}
	
	public Album(String title, double price, String singer, String musician) {
		super(title, price);
		this.singer = singer;
		this.musician = musician;
	}

	public String getSinger() {
		return singer;
	}

	public String getMusician() {
		return musician;
	}
	
	public static void setGst(double gst) {
		if(gst < 0)
			throw new RuntimeException("GST cannot be negative!!");
		else
			Album.gst = gst;
	}
	
	@Override
	public double totalCost() {
		if(discount == 0)
			return (price + (price * Album.gst/100));
		else
			return ((price - (price * discount/100)) + ((price - (price * discount/100)) * Album.gst/100));
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
		System.out.print("Enter Singer: ");
		String singer = sc.nextLine();
		
		System.out.print("Enter Musician: ");
		String musician = sc.nextLine();
		
		this.singer = singer;
		this.musician = musician;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nSinger: %s\nMusician: %s\n", super.toString(), this.singer, this.musician);
	}
}
