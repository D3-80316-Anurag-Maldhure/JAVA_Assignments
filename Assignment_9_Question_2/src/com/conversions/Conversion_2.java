package com.conversions;

public class Conversion_2 {

	public static void main(String[] args) {
		// this is string --> This Is String
		
		String str = "this is string";
		StringBuilder sb = new StringBuilder();
		
		for(String s : str.split(" ")) {
			for(int i=0; i<=s.length(); i++) {
				if(i==0) {
					sb.append(Character.toUpperCase(s.charAt(i)));
				}
				else if(i == s.length()){
					sb.append(" ");
				}
				else {
					sb.append(Character.toLowerCase(s.charAt(i)));
				}
			}
		}
		System.out.println(sb.toString());
	}

}
