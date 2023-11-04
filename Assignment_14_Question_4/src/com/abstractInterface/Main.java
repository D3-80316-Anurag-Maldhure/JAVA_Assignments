package com.abstractInterface;

public class Main {

	static void calculate(double num1, double num2, Arithmetic op) {
	    double result = op.calc(num1, num2);
	    System.out.println("Result: "+result);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Assition :");
		calculate(21.21 , 21.21, ((x,y) -> x+y));
		System.out.println("-------------------");
		
		System.out.println("Multiplication :");
		calculate(21.21 , 21.21, ((x,y) -> x*y));
		System.out.println("-------------------");
		
		System.out.println("Division :");
		calculate(21.21 , 21.21, ((x,y) -> x/y));
		System.out.println("-------------------");
		
		System.out.println("Subtraction :");
		calculate(21.21 , 21.21, ((x,y) -> x-y));
		System.out.println("-------------------");
	}

}
