package com.utility;

import java.util.Scanner;

public class Date implements Cloneable{

	private int day, month, year;
    // ...
    // shallow copy
    public Object clone() throws CloneNotSupportedException {
        Date temp = (Date)super.clone();
        return temp;
    }
    
    public Date() {
	}
    
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void acceptDate(){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter date: ");
		setDay(sc.nextInt());
		System.out.println("Enter month: ");
		setMonth(sc.nextInt());
		System.out.println("Enter year: ");
		setYear(sc.nextInt());	
		sc.close();
	}

	public final int getDay() {
		return day;
	}

	public final void setDay(int day) {
		this.day = day;
	}

	public final int getMonth() {
		return month;
	}

	public final void setMonth(int month) {
		this.month = month;
	}

	public final int getYear() {
		return year;
	}

	public final void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
    
}
