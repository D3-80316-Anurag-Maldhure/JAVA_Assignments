package com.shop.tester;

import java.util.Scanner;
import com.shop.*;
import com.shop.util.*;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shop[] cart = new Shop[5];
		
		int choice = 0;
		int index = 0;
		do {
			System.out.println("===================================\nEnter\n0.Exit\n1.Add book\n2.Add album\n3.Add toy\n4.Set discount\n5.Set GST and VAT\n6.Calculate total bill\n7.Calculate total revenue\n===================================");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				try {
					if(index < cart.length) {
						cart[index] = new Book();
						cart[index].accept(sc);
						index++;
					}
					else
						System.out.println("Cart full!!");
				}
				catch(RuntimeException ex) {
					System.out.println(ex.getMessage());
				}
				break;
				
			case 2:
				try {
					if(index < cart.length) {
						cart[index] = new Album();
						cart[index].accept(sc);
						index++;
					}
					else
						System.out.println("Cart full!!");
				}
				catch(RuntimeException ex) {
					System.out.println(ex.getMessage());
				}
				break;
				
			case 3:
				try {
					if(index < cart.length) {
						cart[index] = new Toy();
						cart[index].accept(sc);
						index++;
					}
					else
						System.out.println("Cart full!!");
				}
				catch(RuntimeException ex) {
					System.out.println(ex.getMessage());
				}
				break;
				
			case 4:
				try {
					System.out.print("Enter discount: ");
					double discount = sc.nextDouble();
					Shop.setDiscount(discount);
				}
				catch(RuntimeException ex) {
					System.out.println(ex.getMessage());
				}
				break;
				
			case 5:
				try {
					System.out.print("Enter GST: ");
					double gst = sc.nextDouble();
					Album.setGst(gst);
					
					System.out.print("Enter VAT: ");
					double vat = sc.nextDouble();
					Toy.setVat(vat);
				}
				catch(RuntimeException ex) {
					System.out.println(ex.getMessage());
				}
				break;
				
			case 6:
				System.out.println("Total bill: " + Shops.calculateTotalBill(cart));
				break;
				
			case 7:
				System.out.println("Total revenue: " + Shops.calculateTotalRevenue(cart));
				break;
				
			default: 
				System.out.println("Invalid choice!!");
			}
		} while(choice != 0);
	}
}
