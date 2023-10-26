package com.tester;

import com.BoundedShape.*;

public class TestApplication {

	public static void main(String[] args) {
		//Superclass reference
		BoundedShape shape;
		
		//Circle
		shape = new Circle(11.11); //upcasting
		Circle circle = (Circle) shape; //downcating
		System.out.println("Radius of Triangle : "+circle.getRadius());
		System.out.println("Area of Triangle : "+shape.calcArea());
		System.out.println("-------------------------------------------");
		
		//Square
		shape = new Square(33.22);//upcasting
		Square square = (Square) shape; //downcating
		System.out.println("Side of Square : "+square.getSide());
		System.out.println("Area of Square : "+shape.calcArea());
		System.out.println("-------------------------------------------");
		
		//Triangle
		Polygon polygon = new Triangle(33.22,43.34,21.55);//upcasting
		Triangle triangle = (Triangle) polygon; //downcating
		System.out.println("Sides of Triangle : ");
		System.out.println(triangle.getSide1());
		System.out.println(triangle.getSide2());
		System.out.println(triangle.getSide3());
		System.out.println("Area of Square : "+shape.calcArea());
		System.out.println("-------------------------------------------");
		
		//Rectangle
		shape = new Rectangle(123.321,214.213);//upcasting
		Rectangle rectangle = (Rectangle) shape; //downcating
		System.out.println("Length of Rectangle : "+rectangle.getLength());
		System.out.println("Breadth of Rectangle : "+rectangle.getBreadth());
		System.out.println("Area of Square : "+shape.calcArea());
		System.out.println("-------------------------------------------");
	}

}
