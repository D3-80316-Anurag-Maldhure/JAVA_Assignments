package com.BoundedShape;

public class Triangle extends Polygon{
	double side1, side2, side3;
	double s;
	
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double calcArea() {
		s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(side2)*(s-side3));
	}
	
	public final double getSide1() {
		return side1;
	}

	public final void setSide1(double side1) {
		this.side1 = side1;
	}

	public final double getSide2() {
		return side2;
	}

	public final void setSide2(double side2) {
		this.side2 = side2;
	}

	public final double getSide3() {
		return side3;
	}

	public final void setSide3(double side3) {
		this.side3 = side3;
	}

	public final double getS() {
		return s;
	}

	public final void setS(double s) {
		this.s = s;
	}

}
