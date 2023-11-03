package com.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.book.Book;


//Store Books in HashMap<> so that for given isbn, book can be searched in fastest possible time. 
//Do we need to write equals() and hashCode() in Book class? 

//Answer - No we do not need to write equals() and hashCode() in Book class since we are searching 
// 			on isbn which is a string and String class has internal equals()

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// declare map: key=isbn, value=Book object
		Map<String,Book> map = new HashMap<>();	
	
		
		// case 1: insert in map
		Book b1 = new Book("ABC113", 2134.11, "Rushi S", 100);
		Book b2 = new Book("ABC114", 2145.11, "Anurag M", 300);
		Book b3 = new Book("ABC112", 3474.11, "Sainath I", 800);
		Book b4 = new Book("ABC111", 9376.11, "Sandesh T", 400);
		
		map.put("ABC113",b1);
		map.put("ABC114",b2);
		map.put("ABC112",b3);
		map.put("ABC111",b4);
		
		//Checking functionality that existing key,if present, is replaced with new value 
		// and also checking return value of put()
		
		Book b5 = new Book("ABC113", 10000.11, "Rushi Shinde", 500);
		
		Book replacedBook = map.put("ABC111",b5);
		if(replacedBook == null) {
			System.out.println("-------------------------------------------");
			System.out.println("Book added!");
			System.out.println(b5);
			System.out.println(" But no book replaced ");
		}
		else {
			System.out.println("-------------------------------------------");
			System.out.println("Book added (but replaced): ");
			System.out.println(b5);
			System.out.println(" Replaced with book: ");
			System.out.println(replacedBook);
		}
		
		Book b6 = new Book("ABC113", 10000.11, "Rushi Shinde", 500);
		
		Book replacedBook2 = map.put("ABC178",b6);
		if(replacedBook2 == null) {
			System.out.println("-------------------------------------------");
			System.out.println("Book added!");
			System.out.println(b6);
			System.out.println(" But no book replaced ");
		}
		else {
			System.out.println("-------------------------------------------");
			System.out.println("Book added (but replaced): ");
			System.out.println(b5);
			System.out.println(" Replaced with book: ");
			System.out.println(replacedBook);
		}
		
		System.out.println("-------------------------------------------");
		System.out.println("Book in Map: ");
		
		Set <Entry<String, Book>> entries = map.entrySet();
		
		for(Entry<String, Book> b : entries) {
			System.out.println(b);
		}
		
		System.out.println("---------------------------------------------------");
		// accept book from user
		Book b7 = new Book();
		b7.acceptBook();
		map.put(b7.getIsbn(),b7);
		
		System.out.println("-------------------------------------------");
		System.out.println("Book in Map: ");
		
		for(Entry<String, Book> b : entries) {
			System.out.println(b);
		}
		
		// case 2: find in map
		System.out.println("---------------------------------------------------");
		System.out.println("Enter the ISBN number of the book you want to find:");
		String isbn = sc.next();
		Book f = map.get(isbn);
		if(f==null) {
			System.out.println("---------------------------------------------------");
			System.out.println("Sorry! Book with ISBN : "+isbn+" not found in Map");
		}
		else {
			System.out.println("---------------------------------------------------");
			System.out.println("Book found: ");
			System.out.println(f);
		}
		
	}
}
