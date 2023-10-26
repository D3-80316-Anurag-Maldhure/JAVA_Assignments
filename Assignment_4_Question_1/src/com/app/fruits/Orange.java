package com.app.fruits;

public class Orange extends Fruit{
	//default value
	public Orange(){
	};
	
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String taste() {
		return "sour";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : "+name+" Color: "+color+" Weight :"+weight;
	}
}
