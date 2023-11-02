package com.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.library.Book;

public class MainApplication {

	public static void main(String[] args) {
		int choice = 0;
		
		List<Book> books = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		class priceDescSortComparator implements Comparator<Book>{
			@Override
			public int compare(Book o1, Book o2) {
				double diff = o1.getPrice() - o2.getPrice(); 
				if(diff == 0)
					return 0;
				else if(diff<0)
					return 1;
				else
					return -1;
			}
		}
		priceDescSortComparator pdscObj = new priceDescSortComparator();
				
		do {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("Please select option from the menu given below : ");
			System.out.println("1. Add new book in List\n"
					+ "2. Display all books in forward order using random access\n"
					+ "3. Search a book with given isbn\n"
					+ "4. Delete a book at given index\n"
					+ "5. Delete a book with given isbn\n"
					+ "6. Delete a book with given name\n"
					+ "7. Sort books by isbn in asc order\n"
					+ "8. Sort books by price in desc order\n"
					+ "9. Reverse the list"
					);
			System.out.println("Please enter your choice : ");
			choice = sc.nextInt();
	
			switch(choice) {
				// 0. Exit with message
				case 0:
					System.out.println("------------------------");
					System.out.println("Thank you for using app!");
					break;
//					1. Add new book in List
//					- If book not present, then add a new book (hint - indexOf())
//					- If book is present, sum its quantity i.e. new quantity = existing quantity + input quantity
				case 1:
					Book b = new Book();
					System.out.println("------------------------");
					b.acceptBook();
					int newQuantity = b.getQuantity();
					
					if(books.contains(b)) {
						int index = books.indexOf(b);
						int oldQuantity = books.get(index).getQuantity();
						books.get(index).setQuantity(oldQuantity+newQuantity);
						System.out.println("----------------------------------");
						System.out.println("Book count updated in the Library!");
					}
					else {
						books.add(b);
						System.out.println("------------------------------");
						System.out.println("New book added to the Library!");
					}
					break;
//					2. Display all books in forward order using random access 
				case 2:
					System.out.println("----------------------------------------");
					System.out.println("All books in forward order :");
					for(int i=0; i<books.size();i++){
						System.out.println(books.get(i));
					}
					break;
//					3. Search a book with given isbn (hint - indexOf())
				case 3:
					String id;
					System.out.println("----------------------------------------------------------------");
					System.out.println("Enter the ISBN number of the book you want to search in library: ");
					id = sc.next();
					Book dummyBook2 = new Book();
					dummyBook2.setIsbn(id);
					if(books.contains(dummyBook2)) { 
						System.out.println("--------------------------");
						System.out.println("Book found in Library DB! ");
						int index = books.indexOf(dummyBook2);
						System.out.println(books.get(index).toString());
					}
					else {
						System.out.println("--------------------------");
						System.out.println("Book NOT FOUND in Library DB!");
					}
					break;
//					4. Delete a book at given index.
				case 4:
					int index;
					System.out.println("----------------------------------------------------------");
					System.out.println("Enter the index of the book you want to remove in library: ");
					index = sc.nextInt();
					if(index<books.size()) { 
						System.out.println("--------------------------");
						System.out.println("Book removed successfully ");
						books.remove(index);
					}
					else {
						System.out.println("--------------------------------------------");
						System.out.println("Can't remove ! Book NOT FOUND in Library DB!");
					}
//					5. Delete a book with given isbn.
				case 5:
					String ide;
					System.out.println("---------------------------------------------------------------------");
					System.out.println("Enter the ISBN number of the book you want to remove in library: ");
					ide = sc.next();
					Book dummyBook1 = new Book();
					dummyBook1.setIsbn(ide);
					if(books.contains(dummyBook1)) { 
						System.out.println("--------------------------");
						System.out.println("Book removed successfully ");
						books.remove(dummyBook1);
					}
					else {
						System.out.println("--------------------------------------------");
						System.out.println("Can't remove ! Book NOT FOUND in Library DB!");
					}
//					6. Delete a book with given name.
				case 6:
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Enter the Author name of the book you want to remove in library: ");
					String name = sc.next();
					Book dummyBook3 = new Book();
					dummyBook3.setAuthorName(name);;
					if(books.contains(dummyBook3)) { 
						System.out.println("--------------------------");
						System.out.println("Book removed successfully ");
						books.remove(dummyBook3);
					}
					else {
						System.out.println("--------------------------------------------");
						System.out.println("Can't remove ! Book NOT FOUND in Library DB!");
					}

					break;
//					7. Sort books by isbn in asc order -- Collections.sort(list);
				case 7:
					System.out.println("----------------------------------------");
					System.out.println("Books sorted by isbn in asc order!");
					Collections.sort(books);
					break;
//					8. Sort books by price in desc order -- Collections.sort(list, comparator);
				case 8:
					System.out.println("----------------------------------------");
					System.out.println("Books sorted by price in desc orde!");
					Collections.sort(books, pdscObj);
					break;
//					9. Reverse the list -- Collections.reverse(list);
				case 9:
					System.out.println("----------------------------------------");
					Collections.reverse(books);
					break;
				default:
					System.out.println("Please enter a valid choice from menu above!");
					break;
			}
			
		}while(choice!=0);
	}
}
