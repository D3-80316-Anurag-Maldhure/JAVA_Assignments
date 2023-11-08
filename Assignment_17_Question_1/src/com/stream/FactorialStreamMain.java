package com.stream;

import java.util.Scanner;
import java.util.stream.Stream;

public class FactorialStreamMain {

	public static void main(String[] args) {
		int Z =1;
		
		System.out.println("\nEnter the Integer value whose factorial you want: ");
		Scanner scanner = new Scanner(System.in);
		Z = scanner.nextInt();
		
		
		Integer result = Stream.iterate(Z, x -> x - 1)
		.limit(5)
		.reduce(1, (a,e) -> a * e);
		
		System.out.println("\n\nFactorial of " + Z + " is: " + result);
		scanner.close();
	}

}
