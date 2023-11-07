package com.book;

public enum Menu {
	
	EXIT("0. EXIT"),
	Add_A_NEW_BOOK("1. Add new book in List"),
	DISPLAY_ALL_BOOKS_IN_FORWARD_ORDER("2. Display all books in forward order using random access"),
	SEARCH_A_BOOK_ISBN("3. Search a book with given isbn"),
	DELETE_A_BOOK_INDEX("4. Delete a book at given index"),
	DELETE_BOOK_ISBN("5. Delete a book with given isbn"),
	DELETE_BOOK_NAME("6. Delete a book with given name"),
	SORT_BOOKS_ISBN_ASC("7. Sort books by isbn in asc order"),
	SORT_BOOKS_PRICE_DESC("8. Sort books by price in desc order"),
	REVERSE_LIST("9. Reverse the list"),
	SAVE_BOOKS_IN_FILE("10. Save books (list) in file"),
	LOAD_BOOKS_FROM_FILE("11. Load books (list) from file");
	
	private final String message; 
	
	private Menu (String message) {
		this.message = message;
	}
	
	public String getMesaage() {
		return message;
	}
}