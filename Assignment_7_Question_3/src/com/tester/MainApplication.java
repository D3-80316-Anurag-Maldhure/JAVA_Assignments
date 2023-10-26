package com.tester;

import com.utility.*;

public class MainApplication {

	public static void main(String[] args) throws CloneNotSupportedException{
		// Initialising dates
		Date d1 = new Date(28, 9, 1983);
        System.out.println("d1 = " + d1.toString());
        Date d2 = (Date)d1.clone();
        System.out.println("d2 = " + d2.toString());
        
        //Initialising person object with date
        Person p1 = new Person("Sandesh", 70, d1);
        System.out.println("p1 = " + p1.toString());
        Person p2 = (Person)p1.clone();
        System.out.println("p2 = " + p2.toString());
        Date d3 = new Date(28, 12, 1999);
        System.out.println("---------------------------------------------------------------------");
        
        //WAY 1 - Using method of class
        p1.getBirth().acceptDate();
        System.out.println("d1 = " + p1.toString());
        System.out.println("d2 = " + p2.toString());
        System.out.println("---------------------------------------------------------------------");
        
        //WAY 2 - Using new object
        p1.setBirth(d3);
        System.out.println("d1 = " + p1.toString());
        System.out.println("d2 = " + p2.toString());
        System.out.println("---------------------------------------------------------------------");
	}

}