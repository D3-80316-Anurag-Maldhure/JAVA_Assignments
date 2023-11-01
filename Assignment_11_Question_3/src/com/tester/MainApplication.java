package com.tester;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.library.Book;

public class MainApplication {

	public static void main(String[] args) {
		int choice = 0;
		
		List<Book> books = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
				
		do {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Please select option from the menu given below : ");
			System.out.println("1. Add new book in list.\n"
					+ "2. Display all books in forward order.\n"
					+ "3. Delete book of given id\n"
					+ "4. Check if book with given isbn is in list or not \n"
					+ "5. Delete all books in list\n"
					+ "6. Display number of books in list\n");
			System.out.println("Please enter your choice : ");
			choice = sc.nextInt();
	
			switch(choice) {
				case 0:
					System.out.println("------------------------");
					System.out.println("Thank you for using app!");
					break;
					
				//1. Add new book in list.
				case 1:
					Book b = new Book();
					System.out.println("------------------------");
					b.acceptBook();
					books.add(b);
					break;
					
				//2. Display all books in forward order (Order in which it was entered)
				case 2:
					Iterator<Book> itr = books.iterator();
					System.out.println("----------------------------------------");
					System.out.println("All books in forward order :");
					while(itr.hasNext()) {
						Book ele = itr.next();
						System.out.println(ele.toString());
					}
					
					
				//3. Delete book of given id
				case 3:
					String ide;
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Enter the ISBN number of the book you want to remove in library: ");
					ide = sc.next();
					Book dummyBook1 = new Book();
					dummyBook1.setIsbn(ide);
					if(books.contains(dummyBook1)) { 
						System.out.println("--------------------------");
						System.out.println("Book removed successfully1 ");
						books.remove(dummyBook1);
					}
					else {
						System.out.println("--------------------------------------------");
						System.out.println("Can't remove ! Book NOT FOUND in Library DB!");
					}
					break;
					
				//4. Check if book with given isbn is in list or not
					//need to create a object and set its field to compare from user
					//Override equals method so we can compare
				case 4:
					String id;
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Enter the ISBN number of the book you want to search in library: ");
					id = sc.next();
					Book dummyBook2 = new Book();
					dummyBook2.setIsbn(id);
					if(books.contains(dummyBook2)) { 
						System.out.println("--------------------------");
						System.out.println("Book found in Library DB! ");
						int index = books.indexOf(dummyBook2);
						//System.out.println(dummyBook2.toString());
						System.out.println(books.get(index).toString());
					}
					else {
						System.out.println("--------------------------");
						System.out.println("Book NOT FOUND in Library DB!");
					}
					break;
					
				//5. Delete all books in list
				case 5:
					System.out.println("--------------------------------");
					System.out.println("All books removed successfully! ");
					books.clear();
					System.out.println("LIBRARY IS EMPTY! ");
					break;
					
				//6. Display number of books in list
				case 6:
					System.out.println("----------------------------------------");
					System.out.println("Display number of books in list = " + books.size());
					break;
				default:
					System.out.println("Please enter a valid choice from menu above!");
					break;
			}
			
		}while(choice!=0);
	}

}
