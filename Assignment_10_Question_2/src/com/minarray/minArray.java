package com.minarray;

public class minArray {
	//Write a generic static method to find minimum from an array of Number.
	public static <T extends Number> void getMinFromArray(T[] arr) {
		T minElement = arr[0];
		for(T ele : arr) {
			if(ele.doubleValue() < minElement.doubleValue()) {
				minElement = ele;
			}
		}
		System.out.println("Minimum value in the array    =     "+minElement);
	}


	public static void main(String[] args) {
		
		Number[] numberArray;
	
		numberArray = new Double[] { 1.112412, 222156391568983598169865698136562.1512, 3.321551, 4.421552 };
		minArray.getMinFromArray(numberArray);
		
		numberArray = new Integer[] {22, 2147483647, -2147483648}; // random, max, min
		minArray.getMinFromArray(numberArray);
		
		numberArray = new Byte [] {100,127,-128}; // random, max, min
		minArray.getMinFromArray(numberArray);
		
		numberArray = new Float [] {12.11f, 21.11f};
		minArray.getMinFromArray(numberArray);
		
		numberArray = new Long [] {21412214l,-2151525215215152141l,2152214214215214124l};
		minArray.getMinFromArray(numberArray);
		
		numberArray = new Short [] {21412,32000,32500};
		minArray.getMinFromArray(numberArray);

	}	
}
