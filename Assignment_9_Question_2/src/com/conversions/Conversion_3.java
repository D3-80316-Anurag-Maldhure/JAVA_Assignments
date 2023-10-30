package com.conversions;

public class Conversion_3 {
	
	public static void main(String[] args) {
		//Example --> eXaMpLe
		String str = "Example";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			if(i%2==0) {
				sb.append(Character.toLowerCase(str.charAt(i)));
			}
			else {
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
		}
		System.out.println(sb.toString());
	}
}
