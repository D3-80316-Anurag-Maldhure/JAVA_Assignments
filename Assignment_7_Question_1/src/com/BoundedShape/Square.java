package com.BoundedShape;

public class Square extends Polygon{
	double side;
	
	public Square() {
	}
	
	public Square(double side) {
		this.side = side;
	}
	

	public final double getSide() {
		return side;
	}

	public final void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calcArea() {
		return side*side;
	}

}
