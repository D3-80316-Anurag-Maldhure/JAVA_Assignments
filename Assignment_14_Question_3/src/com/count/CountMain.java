package com.count;

import java.util.function.Predicate;


//Use following method to count number of strings with length > 6 in given array.
public class CountMain {

	public static int countIf(String[] arr, Predicate<String> cond) {
	    int count = 0;
	    for(String str: arr) {
	        if(cond.test(str))
		count++;
		}
	    return count;
	}
	
	public static void main(String[] args) {
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };
	    // call countIf() to count number of strings have length more than 6 -- using anonymous inner class
	    int cnt = countIf(arr, new Predicate<String>() {
	        public boolean test(String s) {
	            return s.length() > 6;
	        } 
	    });
	    System.out.println("Result: " + cnt); // 2
	    
	    // call countIf() to count number of strings have length more than 6 -- using lambda expressions
	    
	    System.out.println("Result: " + countIf(arr, (x -> x.length()>6))); 
	    
	    // In the above lambda expression, Predicate Functional Interface which has
	    // SAM test() and takes one argument and has boolean return type 
	    // and we have our countIf method which iterates over array and return count
	    // after checking condition provided in lambda condition and returns 
	    // count 
	    
	}

}
