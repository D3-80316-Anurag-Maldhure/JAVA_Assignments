package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class demo {
	//In which collection classes null is not allowed? 
	//Duplicate null is not allowed? Multiple nulls are allowed?
	
	public static void main(String[] args) {
//		Collection<String> c = new ArrayList<>(); 		//Duplicate OK and mutiple null OK
														//Insertion Order maintained
		
//		Collection<String> c = new HashSet<>();			//Duplicate NOT OK and mutiple null NOT OK
														//Insertion Order NOT maintained
		
//		Collection<String> c = new LinkedHashSet<>();   //Duplicate NOT OK and mutiple null NOT OK
														//Insertion Order maintained
		
		Collection<String> c = new TreeSet<>();			//Duplicate NOT OK and null NOT OK
														//Sorted internally based on Natural Ordering
		
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");

		System.out.println(c.toString());
	}

}
