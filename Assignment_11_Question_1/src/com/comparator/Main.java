package com.comparator;

import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) {
		
		class DoubleSortComparator implements Comparator<Double>{
			@Override
			public int compare(Double d1, Double d2) {
				if(d1 == d2)
					return 0;
				else if(d1 > d2)
					return 1;
				else
					return 0;
			}
		}
		
		Double[] doubleArray = new Double[] {213.14,124.324,125.125,235.15,500.90,1.1};

		System.out.println("Before sort : ");
		for(Double d:doubleArray)
			System.out.print(d + " ");
		System.out.println();
		
		DoubleSortComparator x = new DoubleSortComparator();
		DoubleSort.selectionSort(doubleArray, x);
		
		System.out.println("After sort : ");
		for(Double d:doubleArray)
			System.out.print(d+ " ");
		
	}

}
