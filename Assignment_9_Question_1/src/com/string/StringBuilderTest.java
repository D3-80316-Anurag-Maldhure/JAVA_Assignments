package com.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		//.equals() method is not overridden in StringBuffer and StringBuilder and taken from Object class
		//So content is not compared
		//Only address is checked
		
		StringBuilder s1 = new StringBuilder("Sunbeam");
		StringBuilder s2 = new StringBuilder("Sunbeam");
		System.out.println(s1 == s2);      		//false 
		System.out.println(s1.equals(s2)); 		//false
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3 == s4);     		//false   - Since String object is being returned by toString() method
		System.out.println(s3.equals(s4)); 		//true
		
		String s5 = s1.toString().intern();
		String s6 = s2.toString().intern();
		System.out.println(s5 == s6);       	//true
		System.out.println(s5.equals(s6)); 		//true
	}

}
