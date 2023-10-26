package com.app.fruits;

//import com.app.tester.$missing$;

//import java.util.Scanner;

public class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit() {
		this.color = "No color";
		this.weight = 0;
		this.name = "No fruit selected";
		this.isFresh = true;
	}
	
	public Fruit(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String taste() {
		return "No taste";
	}

	public final String getColor() {
		return color;
	}

	public final void setColor(String color) {
		this.color = color;
	}

	public final double getWeight() {
		return weight;
	}

	public final void setWeight(double weight) {
		this.weight = weight;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final boolean getisFresh() {
		return isFresh;
	}

	public final void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
}
