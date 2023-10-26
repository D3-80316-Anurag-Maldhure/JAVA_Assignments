package com.app.tester;

import com.app.fruits.*;
import java.util.Scanner;

public class FruitBasket {
	static int numberOfFruits;

	public static void main(String[] args) {
		int choice =1;
		int counter=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of fruits you want in your Fruit Basket :");
		numberOfFruits = sc.nextInt();
		
		Fruit[] fruitBasket = new Fruit[numberOfFruits];
		

		
		while(choice!=0) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("PLEASE SELECT FROM OPTIONS BELOW :");
			System.out.println("0. Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
			System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale (optional)");
			System.out.println("--------------------------------------------------------------------------------");
			
			choice = sc.nextInt();
			
			switch(choice){
				case 0:
					choice=0;
					System.out.println("Thank you! Please visit again.");
					break;
				case 1:
					fruitBasket[counter++]=new Mango("Yellow",213.21,"Mango",true);
					break;
				case 2:
					fruitBasket[counter++]=new Orange("Orange",100.21,"Orange",true);
					break;
				case 3:
					fruitBasket[counter++]=new Apple("Red",140.21,"Apple",true);
					break;
				case 4:
					//for-each --- null checking --getName()
					for(Fruit fruit :fruitBasket) {
						if(fruit == null) {
							break;
						}
						else {
							System.out.println(fruit.getName());
						}
					}
					break;
				case 5:
					//eg : for-each , null checking --toString , taste, isFresh : getter
					for(Fruit fruit :fruitBasket) {
						if(fruit == null) {
							break;
						}
						else {
							System.out.println(fruit.toString() + fruit.taste() + " " + fruit.getisFresh());
						}
					}
					break;
				case 6:
					for(Fruit fruit :fruitBasket) {
						if(fruit == null) {
							break;
						}
						else {
							if(fruit.getisFresh()==false)
							System.out.println(fruit.getName() + " Taste: "+ fruit.getisFresh() + " Fruit is fresh: "+ fruit.taste());
						}
					}
					break;
				case 7:
//					i/p : index
//					eg : setter : isFresh : false
//					o/p : error message (in case of invalid index) or mark it stale
					int index;
					
					System.out.println("Enter the index of the fruit in the Fruit Basket which you want to make stale(0 based indexing)");
					index = sc.nextInt();
					
					for(int i=0; i<fruitBasket.length; i++) {
						if(index == i) {
							fruitBasket[i].setFresh(false);
						}
					}			
					break;
				case 8:
					
					
					for(Fruit fruit :fruitBasket) {
						if(fruit.taste().equals("sour")) {
							fruit.setFresh(false);
						}
					}
					break;
					
				default:
					System.out.println("Enter a valid choice from above menu!");
				    break;
			}
		}
	}
}
