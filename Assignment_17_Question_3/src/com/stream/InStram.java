package com.stream;

import java.util.*;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InStram {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 6, 7, 9, 2);
		
		System.out.println("\nStream from collection: ");
		list1.stream()
			.forEach(e -> System.out.println(e));
		
		System.out.println("\nStream from array using Stream.of(): ");
		Integer[] arr2 = { 6, 7, 9, 2 };
		Stream.of(arr2)
			.forEach(e -> System.out.println(e));

		System.out.println("\nStream from array using Arrays.stream(): ");
		Integer[] arr3 = { 6, 7, 9, 2 };
		Arrays.stream(arr3)
			.forEach(e -> System.out.println(e));
		
		System.out.println("\nStream from array using Stream.iterate(): ");
		Stream.iterate(1, x -> x + 1)
			.limit(6)
			.forEach(e -> System.out.println(e));
		
		
		System.out.println("\nStream from array using Stream.generate(): ");
		Stream.generate(() -> Math.random())
			.limit(10)
			.forEach(e -> System.out.printf("%.4f\n", e));
		
		System.out.println("\nStream of Primitive types: ");
		IntSummaryStatistics stats = IntStream.rangeClosed(1, 10)
			.summaryStatistics();
		System.out.println(stats);
		
		IntStream str = IntStream.range(1, 11);
		int sum = str.peek(x -> System.out.println(x)).sum();
		System.out.println("Sum = " +sum);

	}
}
