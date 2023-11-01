package com.student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[] {
				new Student(14, "Avdhut", "Zampa", 100.00),
				new Student(65, "Kunal", "Nanded", 100.00),
				new Student(23, "Rushikesh", "Baramti", 99.00),
				new Student(31, "Kaustubh", "Baramti", 88.00),
				new Student(32, "Banana", "Baramti", 88.00),
		};
		
		
		
		System.out.println("Before sort : ");
		for(Student s: studentArray) {
			System.out.println(s.toString());
		}
		
		class StudentMultiLevelSort implements Comparator<Student>{
			
			@Override
			public int compare(Student o1, Student o2) {
				int diff = -o1.getCity().compareTo(o2.getCity());
				if(diff==0) {
					diff = -Double.compare(o1.getMarks(), o2.getMarks());
					if(diff==0) {
						diff = o1.getName().compareTo(o2.getName());
					}
				}
				return diff;
			}
			
		} 

		Arrays.sort(studentArray, new StudentMultiLevelSort());
		
		System.out.println("After sort : ");
		for(Student s: studentArray) {
			System.out.println(s.toString());
		}
	}

}
