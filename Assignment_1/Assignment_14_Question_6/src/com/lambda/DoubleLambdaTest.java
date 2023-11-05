package com.lambda;

public class DoubleLambdaTest {
	
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for(T element  : arr) {
			if (c.compare(element, key)) {
                count++;
            }
		}
		return count;
	}
	
	public static void main(String[] args) {
		Double [] arr = {55.5, 44.4, 33.3, 22.2, 11.1, 55.5, 77.7, 99.99};
		Double key = 44.4;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Double Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 44.4)
	}
}
