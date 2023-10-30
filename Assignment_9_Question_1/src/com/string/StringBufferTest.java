package com.string;

public class StringBufferTest {

	public static void main(String[] args) {
		//.equals() method is not overridden in StringBuffer and StringBuilder and taken from Object class
		//So content is not compared
		//Only address is checked
		
		//example 1
		StringBuffer s1 = new StringBuffer("Sunbeam");
		StringBuffer s2 = new StringBuffer("Sunbeam");
		System.out.println("Example 1");     
		System.out.println(s1 == s2);       // false
		System.out.println(s1.equals(s2));  // false
		
		//example 2
		StringBuffer s3 = new StringBuffer("Sunbeam");
		String s4 = new String("Sunbeam");
		System.out.println("Example 2");     
		//System.out.println(s3 == s4);       	// Incompatible operand types StringBuffer and Strin
		System.out.println(s3.equals(s4)); 	 	// false
		
		//example 3
		StringBuffer s5 = new StringBuffer("Sunbeam");
		StringBuffer s6 = s5.reverse();
		System.out.println("Example 3");     
		System.out.println(s5 == s6);       	//true
		System.out.println(s5.equals(s6)); 	 	//true
		
		//example 4
		System.out.println("Example 4"); 
		StringBuffer s = new StringBuffer();
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 0
		s.append("1234567890");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 16, 10
		s.append("ABCDEFGHIJKLMNOPQRSTUV");
		System.out.println("Capacity: " + s.capacity() + ", Length: " + s.length()); // 34, 32

	}

}
