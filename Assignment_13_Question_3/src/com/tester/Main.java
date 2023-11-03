package com.tester;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.book.Book;

public class Main {

	public static void main(String[] args) {
		boolean flag = false;
		
		Collection<Book> bookSet = new LinkedHashSet<Book>();	
//		Set<Book> bookSet = new LinkedHashSet<Book>();				OK
//		LinkedHashSet<Book> bookSet = new LinkedHashSet<Book>(); 	OK
		
		flag = bookSet.add(new Book("ABC113", 2134.11, "Rushi Shinde", 100));
		if(flag == true) {
			System.out.println("Book added!");
			flag = false;
		}
		else {
			System.out.println("Cannot add book...Already exists");
		}
		
		flag = bookSet.add(new Book("ABC113", 2134.11, "Rushi Shinde", 100));
		if(flag == true) {
			System.out.println("Book added!");
			flag = false;
		}
		else {
			System.out.println("Cannot add book...Already exists");
		}
		
		bookSet.add(new Book("ABC114", 2145.11, "Anurag M", 300));
		bookSet.add(new Book("ABC112", 3474.11, "Sainath I", 800));
		bookSet.add(new Book("ABC111", 2376.11, "Sandesh T", 400));
		
		System.out.println(bookSet);	
		
//		If any book with duplicate isbn is added, what will happen? Books are stored in which order?
		
//		Answer - 	duplicate book will not be added as equals() and hashCode() are overriden
//					books are sorted in order of INSERTION
		

//		Ordered set (preserves order of insertion) 
//		Elements must implement equals() and hashCode() 
//		Slower than HashSet

		
	}
}
