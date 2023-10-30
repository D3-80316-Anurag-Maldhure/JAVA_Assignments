package com.string;

public class StringTest {

	public static void main(String[] args) {
		
		//example 1
		String s1 = "Sunbeam";
		String s2 = "Sunbeam";
		System.out.println("example 1"); 
		System.out.println(s1 == s2);       //true
		System.out.println(s1.equals(s2));	//true
		
		//example 2
		String s3 = new String("Sunbeam");
		String s4 = new String("Sunbeam");
		System.out.println("example 2"); 
		System.out.println(s3 == s4);       //false
		System.out.println(s3.equals(s4));	//true
		
		//example 3
		String s5 = "Sunbeam";
		String s6 = new String("Sunbeam");
		System.out.println("example 3"); 
		System.out.println(s5 == s6);       //false
		System.out.println(s5.equals(s6));	//true
		
		//example 4
		String s7 = "Sunbeam";
		String s8 = "Sun" + "beam";
		System.out.println("example 4"); 
		System.out.println(s7 == s8);       //true
		System.out.println(s7.equals(s8));	//true
		
		//example 5
		String s9 = "Sunbeam";
		String s10 = "Sun";
		String s11 = s10 + "beam";
		System.out.println("example 5"); 
		System.out.println(s9 == s11);       //false
		System.out.println(s9.equals(s11));	//true
		
		//example 6
		String s12 = "Sunbeam";
		String s13 = new String("Sunbeam").intern();
		System.out.println("example 6"); 
		System.out.println(s12 == s13);       	//true
		System.out.println(s12.equals(s13));	//true
		
		//example 7
		String s14 = "Sunbeam";
		String s15 = "SunBeam";
		System.out.println("example 7"); 
		System.out.println(s14 == s15);       				// false
		System.out.println(s14.equals(s15));  				// false
		System.out.println(s14.equalsIgnoreCase(s15));  	// true
		System.out.println(s14.compareTo(s15));  			// 32
		System.out.println(s14.compareToIgnoreCase(s15));  // 0
	}

}
