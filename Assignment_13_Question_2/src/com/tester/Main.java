package com.tester;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.book.Book;

public class Main {

	public static void main(String[] args) {
		boolean flag = false;
		
//		Collection<Book> bookSet = new HashSet<Book>();	OK
//		Set<Book> bookSet = new HashSet<Book>();		OK
		HashSet<Book> bookSet = new HashSet<Book>();
		
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
		
//		If any book with duplicate isbn is added, what will happen? 
//				Books are stored in which order? Solve duplicate ISBN problem.
		
//		Answer - 	duplicate book will be added
//					books are sorted in order of ISBN number
//					Duplicate ISBN can be solved by overriding hashCode() also
		

//		Non-ordered set (elements stored in any order) 
//		Elements must implement equals() and hashCode() 
//		Fast execution

		
	}
}
