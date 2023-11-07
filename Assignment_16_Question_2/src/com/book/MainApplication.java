package com.book;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//2. In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. 
//   Save books in file and load books from file. Use ObjectOutputStream and ObjectInputStream.

public class MainApplication {
	
	static Menu menu(Scanner sc) {
		Menu[] choices = Menu.values();
		for(Menu m : choices) {
			System.out.println(m.getMesaage());
		}
		System.out.println("Please enter your choice : ");
		return choices[sc.nextInt()];
	}

	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		Menu userChoice;
		
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
			userChoice = menu(sc);
			
			switch(userChoice) {
				// 0. Exit with message
				case EXIT:
					System.out.println("------------------------");
					System.out.println("Thank you for using app!");
					break;
//					1. Add new book in List
//					- If book not present, then add a new book (hint - indexOf())
//					- If book is present, sum its quantity i.e. new quantity = existing quantity + input quantity
				case Add_A_NEW_BOOK:
					Book b = new Book();
					System.out.println("------------------------");
					b.acceptBook(sc);
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
				case DISPLAY_ALL_BOOKS_IN_FORWARD_ORDER:
					System.out.println("----------------------------------------");
					System.out.println("All books in forward order :");
					for(int i=0; i<books.size();i++){
						System.out.println(books.get(i));
					}
					break;
//					3. Search a book with given isbn (hint - indexOf())
				case SEARCH_A_BOOK_ISBN:
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
				case DELETE_A_BOOK_INDEX:
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
				case DELETE_BOOK_ISBN:
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
				case DELETE_BOOK_NAME:
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
				case SORT_BOOKS_ISBN_ASC:
					System.out.println("----------------------------------------");
					System.out.println("Books sorted by isbn in asc order!");
					Collections.sort(books);
					break;
//					8. Sort books by price in desc order -- Collections.sort(list, comparator);
				case SORT_BOOKS_PRICE_DESC:
					System.out.println("----------------------------------------");
					System.out.println("Books sorted by price in desc orde!");
					Collections.sort(books, pdscObj);
					break;
//					9. Reverse the list -- Collections.reverse(list);
				case REVERSE_LIST:
					System.out.println("----------------------------------------");
					System.out.println("Books list reversed!");
					Collections.reverse(books);
					break;
					// 10. Save books (list) in file
				case SAVE_BOOKS_IN_FILE:
					System.out.println("----------------------------------------");
					try(FileOutputStream fout = new FileOutputStream("BOOKLISTOBJ.text")) {
						try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
						 	oout.writeObject(books);
						 	System.out.println("Books Saved: " + books.size());
						} // oout.close();
					} // fout.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("----------------------------------------");
					System.out.println("Books saved successfully!");
					break;
				case LOAD_BOOKS_FROM_FILE:
					List<Book> tempList = null;
					try(FileInputStream fin = new FileInputStream("BOOKLISTOBJ.text")) {
						try(ObjectInputStream oin = new ObjectInputStream(fin)) {
							tempList = (List<Book>) oin.readObject();
						} // oin.close();
					} // fin.close();
					catch (Exception e) {
						e.printStackTrace();
					}
					books.addAll(tempList);
					System.out.println("----------------------------------------");
					System.out.println("Books loaded successfully!");
//					books.forEach(x -> System.out.println(x));
					
					break;
				default:
					System.out.println("Please enter a valid choice from menu above!");
					break;
			}
			
		}while(userChoice != Menu.EXIT);
	}
}