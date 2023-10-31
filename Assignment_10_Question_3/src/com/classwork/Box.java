package com.classwork;

public class Box <T extends Displayable>{
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
	public void show() {
		obj.display();
	}
	
	public static void printAnyBox(Box b) {
	    System.out.println(b.get().toString());
	}
	
	public static void printDisplayableBox(Box b) {
	    b.get().display();
	}
	
}
