package com.stream;

import java.util.Random;
import java.util.stream.IntStream;

public class SumRandomIntegerStream {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		IntStream str =  random.ints(10, 1, 1000);
		int sum = str.sum();

		System.out.println("Sum = " + sum);
		
	}

}
