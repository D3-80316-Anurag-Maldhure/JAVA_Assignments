package com.conversions;

import java.util.StringTokenizer;

public class Conversion_1 {

	public static void main(String[] args) {
		//Bank Of Maharashtra --> BOM
		
		//Way1 - String.split(regrex) on String literal
		String s1 = "Bank Of Maharashtra";
		String[] strArray = s1.split(" ");
		for(String str: strArray) {
			System.out.print(str.charAt(0));
		}
		
		System.out.println("");
		
		//Way2- StringTokenizer.split()
		StringTokenizer s2 = new StringTokenizer("Bank Of Maharashtra");
	     while (s2.hasMoreTokens()) {
	         System.out.print(s2.nextToken().charAt(0));
	     }
	     
	     System.out.println("");
	     
	    //Way3 - String.split(regrex) similar to Way 1
	    StringBuilder s3 = new StringBuilder("Bank Of Maharashtra");
		String[] s5 = s3.toString().split("\\s");
		for(String st: s5) {
			System.out.print(st.charAt(0));
		}
	}

}
