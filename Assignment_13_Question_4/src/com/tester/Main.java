package com.tester;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.book.Book;

public class Main {

	public static void main(String[] args) {
		boolean flag = false;
		
//		Collection<Book> bookSet = new TreeSet<Book>();		OK
//		Set<Book> bookSet = new TreeSet<Book>();			OK   
//		SortedSet<Book> bookSet = new TreeSet<Book>();		OK
//		NavigableSet<Book> bookSet = new TreeSet<Book>();	
		TreeSet<Book> bookSet = new TreeSet<Book>(); 		
		
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
		
//		In above assignment use TreeSet instead of LinkedHashSet. 
//		Use natural ordering for the Book. 
//		If any book with duplicate isbn is added, what will happen?
//		Books are stored in which order?
		
//		Answer - Duplicate entries not allowed even though equals() and hashCode() are missing
//				 Sorted in the order of Comparator's compareTo method provided or by Comparator

//		Sorted navigable set (stores elements in sorted order) 
//		Elements must implement Comparable or provide Comparator 
//		Slower than HashSet and LinkedHashSet

		
	}
}
