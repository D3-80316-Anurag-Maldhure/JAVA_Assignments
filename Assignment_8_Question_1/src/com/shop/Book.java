package com.shop;

import java.util.Scanner;
import com.shop.util.Util;

public class Book extends Shop {
	private String isbn;
	private String author;
	private String subject;
	
	public Book() {
		super();
		this.isbn = "";
		this.author = "";
		this.subject = "";
	}
	
	public Book(String title, double price, String isbn, String author, String subject) {
		super(title, price);
		this.isbn = isbn;
		this.author = author;
		this.subject = subject;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public double totalCost() {
		if(discount == 0)
			return price;
		else
			return (price - (price * discount/100));
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
		System.out.print("Enter ISBN: ");
		String isbn = sc.nextLine();
		
		System.out.print("Enter Author: ");
		String author = sc.nextLine();
		
		System.out.print("Enter Subject: ");
		String subject = sc.nextLine();
		
		this.isbn = isbn;
		this.author = author;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return String.format("%s\nISBN: %s\nAuthor: %s\nSubject: %s\n", super.toString(), this.isbn, this.author, this.subject);
	}
}
