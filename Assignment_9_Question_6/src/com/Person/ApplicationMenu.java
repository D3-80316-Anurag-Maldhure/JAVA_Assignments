package com.Person;

import java.util.Scanner;

import com.Person.Person.Functionalities;

public class ApplicationMenu {
	
	public static void main(String[] args) {
		int choice=0;
		Person [] pArray = new Person[5];
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("---------------------------------------");
			System.out.println("Please select from the given options:");
			System.out.println("0. EXIT");
			System.out.println("1. Add new person");
			System.out.println("2. Display all people");
			System.out.println("3. Find a person by name");
			System.out.println("Please enter your choice :");
			choice = sc.nextInt();
			Functionalities f = Functionalities.values()[choice];
		
			switch(f) {
				case EXIT:
					System.out.println("---------------------------------------");
					System.out.println("Thank you for using the app!");
					System.out.println("---------------------------------------");
					break;
				case AddNewPerson:
					System.out.println("---------------------------------------");
					for(int i=0; i<pArray.length; i++) {
						if(pArray[i]==null) {
							pArray[i] = new Person();
							pArray[i].acceptPerson();
							break;
						}
						else {
							System.out.println("ARRAYOVERFLOW! Person array of size 5 is full");
						}
					}
					break;
				case DisplayAllPeople:
					System.out.println("---------------------------------------");
					for(int i=0; i<pArray.length; i++) {
						if(pArray[i]==null) {
							break;
						}
						else {
							System.out.println(pArray[i].toString());
						}
					}
					break;
				case FindAPersonByName:
					System.out.println("---------------------------------------");
					String NAME;
					int flagPersonFound = 0;
					System.out.println("Enter the name of the person you want to search:");
					NAME = sc.next();
					System.out.println("---------------------------------------");
					for(int i=0; i<pArray.length; i++) {
						if(pArray[i].getName().equals(NAME)) {
							flagPersonFound =1;
							System.out.println("Person with name - "+ NAME + " - details found at index: ["+i+"]");
							System.out.println(pArray[i].toString());
							break;
						}
					}
					if(flagPersonFound == 0){
						System.out.println("Person with name - "+ NAME + " not found!");
					}
					break;
				default:
						System.out.println("Enter a valid choice!");
					break;
			}
		}while(choice!=0);
	}

}
