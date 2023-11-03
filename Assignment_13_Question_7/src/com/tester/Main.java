package com.tester;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.student.Student;

// Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest possible time. 
// Do we need to write equals() and hashCode() in Student class? 
// Follow menu-driven approach. 


//Answer - No we do not need to write equals() and hashCode() in Student class since we are searching 
//	on roll which is a Integer and Integer class has internal equals() and hashCode() defined

public class Main {

	public static void main(String[] args) {

		Map<Integer ,Student> map = new LinkedHashMap<>();
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("-------------------------------------------------");
			System.out.println("Please select option from the menu given below : ");
			System.out.println("0. Exit\n"
					+ "1. Add a student\n"
					+ "2. Display all students\n"
					+ "3. Search a student by roll number\n"
					);
			System.out.println("Please enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice){
				//Exit with message
				case 0:
					System.out.println("-------------------------------------");
					System.out.println("Thank you for using our application!");
					break;
				//Add a student
				case 1:
					System.out.println("-------------------------------------");
					Student studentToAdd = new Student();
					studentToAdd.acceptStudent();
					Student flag = map.put(studentToAdd.getRoll() ,studentToAdd);
					if(flag == null) {
						System.out.println("----------------------------");
						System.out.println("New Student added successfully!");
						System.out.println("Student : ");
						System.out.println(studentToAdd);
					}
					else {
						System.out.println("------------------------------");
						System.out.println("Student REPLACED successfully");
						System.out.println("Initital Student :");
						System.out.println(flag);
						System.out.println("Replaced Student :");
						System.out.println(studentToAdd);
					}

					
					break;
//				Display all students
				case 2:
					System.out.println("------------------------------------------------");
					System.out.println("All Student Details : ");
					Set <Entry<Integer, Student>> entries = map.entrySet();
					for(Entry<Integer, Student> s : entries) {
						System.out.println(s);
					}

					break;
				//Search a student by roll number
				case 3:
					System.out.println("----------------------------------------------");
					System.out.println("Enter the roll of the student you want to find: ");
					int studentFindRoll = sc.nextInt();
					
					Student studentFound = map.get(studentFindRoll);
					
					if(studentFound == null) {
						System.out.println("----------------------------");
						System.out.println("Student not found!");
					}
					else {
						System.out.println("--------------------");
						System.out.println("Student found :");
						System.out.println(studentFound);
					}
					break;
				default:
					System.out.println("Please enter a valid choice from the above menu!");
					break;
			}
		}while(choice!=0);
		sc.close();
	}
}
