package com.shop.util;

import com.shop.Shop;

public class Shops {
	public static double calculateTotalBill(Shop[] cart) {
		double totalBill = 0;
		for(Shop product : cart) {
			if(product == null)
				break;
			totalBill = totalBill + product.totalCost();
		}
		return totalBill;
	}
	
	public static double calculateTotalRevenue(Shop[] cart) {
		double totalRevenue = 0;
		for(Shop product : cart) {
			if(product == null)
				break;
			totalRevenue = totalRevenue + product.costWithoutTax();
		}
		return totalRevenue;
	}
}
