package com.book;

import java.util.Objects;
import java.util.Scanner;

public class Book{
	String isbn;
	double price;
	String authorName; 
	int quantity;
	
	public Book(){
		this.isbn = "UNPUBLISHED_0000XXXXXX";
		this.price = 0.00;
		this.authorName = "Temp Name";
		this.quantity = 0;
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public void acceptBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book details: ");
		System.out.println("Enter ISBN: ");
		setIsbn(sc.next());
		System.out.println("Enter price: ");
		setPrice(sc.nextDouble());
		System.out.println("Enter Author Name: ");
		setAuthorName(sc.next());
		System.out.println("Enter Quantity: ");
		setQuantity(sc.nextInt());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [isbn=").append(isbn).append(", price=").append(price).append(", authorName=")
				.append(authorName).append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}