package com.BoundedShape;

public class Circle extends BoundedShape{
	double radius;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return Math.PI*radius*radius;
	}

	public final double getRadius() {
		return radius;
	}

	public final void setRadius(double radius) {
		this.radius = radius;
	}
}
