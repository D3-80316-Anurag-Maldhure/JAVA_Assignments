package com.BoundedShape;

public class Rectangle extends Polygon{
	double length, breadth;
	
	public Rectangle() {
	}
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calcArea() {
		return length*breadth;
	}

	public final double getLength() {
		return length;
	}

	public final void setLength(double length) {
		this.length = length;
	}

	public final double getBreadth() {
		return breadth;
	}

	public final void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
}
