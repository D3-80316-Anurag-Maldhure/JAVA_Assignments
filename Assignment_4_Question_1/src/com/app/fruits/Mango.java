package com.app.fruits;

public class Mango extends Fruit{
	//default value
	public Mango(){
	};
	
	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
	}

	@Override
	public String taste() {
		return "sweet";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : "+name+" Color: "+color+" Weight :"+weight;
	}
}
