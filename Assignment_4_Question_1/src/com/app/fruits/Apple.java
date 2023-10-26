package com.app.fruits;

public class Apple extends Fruit{
	
	//default value
	public Apple(){
	};
	
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : "+name+" Color: "+color+" Weight :"+weight;
	}
}
