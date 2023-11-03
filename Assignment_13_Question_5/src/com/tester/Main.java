package com.tester;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.book.Book;

public class Main {

	public static void main(String[] args) {
		
		class bookPriceAscComparator implements Comparator<Book>{

			@Override
			public int compare(Book o1, Book o2) {
				double diff = o1.getPrice() - o2.getPrice();
				if(diff==0)
					return 0;
				else if(diff>0)
					return 1;
				else
					return -1;
			}
		}
		
		bookPriceAscComparator bpacCompObj = new bookPriceAscComparator();
		
		boolean flag = false;
		
//		Collection<Book> bookSet = new TreeSet<Book>();		OK
//		Set<Book> bookSet = new TreeSet<Book>();			OK   
//		SortedSet<Book> bookSet = new TreeSet<Book>();		OK
//		NavigableSet<Book> bookSet = new TreeSet<Book>();	
		TreeSet<Book> bookSet = new TreeSet<Book>(bpacCompObj); 		
		
		flag = bookSet.add(new Book("ABC113", 2134.11, "Rushi Shinde", 100));
		if(flag == true) {
			System.out.println("Book added!");
			flag = false;
		}
		else {
			System.out.println("Cannot add book...Already exists");
		}
		
		flag = bookSet.add(new Book("ABC113", 2174.11, "Rushi Shinde", 100));
		if(flag == true) {
			System.out.println("Book added!");
			flag = false;
		}
		else {
			System.out.println("Cannot add book...Already exists");
		}
		
		bookSet.add(new Book("ABC114", 2145.11, "Anurag M", 300));
		bookSet.add(new Book("ABC112", 3474.11, "Sainath I", 800));
		bookSet.add(new Book("ABC111", 9376.11, "Sandesh T", 400));
		
		System.out.println("\nTraversal using Iterator: ");
		Iterator<Book> itr = bookSet.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele + ", ");
		}
		
		
		System.out.println("\nTraversal using Descending Iterator: ");
		Iterator<Book> itrDesc = bookSet.descendingIterator();
		while(itrDesc.hasNext()) {
			Book ele = itrDesc.next();
			System.out.println(ele + ", ");
		}
		
		
//		 In above assignment, Use TreeSet to store all books in descending order of price. 
//		 Natural ordering for the Book should be isbn (do not change it). Display
//		 them using iterator() and descendingIterator().
		
//		Need to use Compartor() to define sorting on Price apart from Natural ordering on isbn
		
	}
}
