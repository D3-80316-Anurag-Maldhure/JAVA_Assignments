package com.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		//Write a method to check if string is palindrome or not.
		
		String[] palindromeArray = {"AWA", "RUSHIKESH", "MADAM", "AWESOME", "DEIFIED", "AA"};
		
		for(int i=0; i<palindromeArray.length;i++) {
			if(isPalindrome(palindromeArray[i])) {
				System.out.println(palindromeArray[i] + " is Palindrome");
			}
			else {
				System.out.println(palindromeArray[i] + " is not a Palindrome");
			}
		}
		
	}
	
	//Helper function
	public static boolean isPalindrome(String s) {
		if(s.length()>2){
			for(int i=0; i<s.length()/2; i++) {
				if(s.charAt(i) != s.charAt(s.length()-i-1)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	

}
