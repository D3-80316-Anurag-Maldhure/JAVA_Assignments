package com.tester;

import java.util.Scanner;

import com.customexceptionhandler.EmployeeException;
import com.people.*;


public class Box<T extends Employee> {
	private T obj;
	
	public Box() {
	}
	
	public Box(T obj) throws EmployeeException {
		
		super();
		Scanner sc = new Scanner(System.in);
		this.obj = obj;
		obj.accept(sc);
	}

	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return this.obj;
	}
// 	public <T> void sumSalary(T b) throws EmployeeException{
//		if(b instanceof Labor) {
//			Labor obj =(Labor)b;
//			System.out.println(obj.calcSalary());
//		}else if(b instanceof Salesman) {
//			Salesman obj = (Salesman)b;
//			System.out.println(obj.calcSalary());
//		}else {
//			Clerk obj = (Clerk)b;
//			System.out.println(obj.calcSalary());
//		}
	
//	}
	
	
//  Method 2 
	public void sumSalary() throws EmployeeException{		
		System.out.println(this.obj.calcSalary());
	}

  public static void main(String[] args) {	

	  
//    Method 1
//	  try {
//	  Scanner sc = new Scanner(System.in);
//	  Labor l1 = new Labor();
//	  l1.accept(sc);
//	  sumSalary(l1);
//	  Salesman s1 = new Salesman();
//	  s1.accept(sc);
//	  sumSalary(s1);
//	  Clerk c1 = new Clerk();
//	  c1.accept(sc);
//	  sumSalary(c1);
//	  }
//    catch(EmployeeException e) {
//	  	System.out.println("Error : " + e.getMessage());
//	  }
	  
//	  Method 2
	  try {
		  Box<Labor> b = new Box<Labor>(new Labor());
		  b.sumSalary();
	  }
	  catch(EmployeeException e) {
		  System.out.println("Error : " + e.getMessage());  
	  }
  }
  
}