package com.vowels;

public class vowels {

	public static void main(String[] args) {
		// From an array of strings print the strings ending with vowels.
		
		String string = "Rushikesh doesn't know how to use gpay to purchase banana";
		
		String[] strArray = string.split(" "); //required array of strings instead of typing string array
		
		for(String s: strArray) {
			if(s.endsWith("a")||s.endsWith("e")||s.endsWith("i")||s.endsWith("o")||s.endsWith("u")){
				System.out.println(s);
				
			}
		}
	}

}
