package com.classwork;

public class Main {
	
	public static void main(String[] args) {
		Box<Person> b1 = new Box<>();
		b1.set(new Person("Nilesh", 40));
		b1.show();
		System.out.println("-----------------------");
		Box.printAnyBox(b1);
		System.out.println("-----------------------");
		Box.printDisplayableBox(b1);
		
		System.out.println("----------------------------------------------------------------------------");
		
		Box<Book> b2 = new Box<>();
		b2.set(new Book("Atlas Shrugged", 763.39));
		b2.show();
		System.out.println("-----------------------");
		Box.printAnyBox(b2);
		System.out.println("-----------------------");
		Box.printDisplayableBox(b2);
		
		//Box<Car> b3 = new Box<>(); // compiler error
		
		//Box<String> b4 = new Box<>(); // compiler error
		
		System.out.println("----------------------------------------------------------------------------");
		
		Box<Car> b3 = new Box<>();
		b3.set(new Car("Porsche 911", 13000004.39));
		b3.show();
		System.out.println("-----------------------");
		Box.printAnyBox(b3);
		System.out.println("-----------------------");
		Box.printDisplayableBox(b3);
		
	}
}
