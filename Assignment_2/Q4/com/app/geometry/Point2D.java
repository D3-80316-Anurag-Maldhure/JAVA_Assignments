package com.app.geometry;

import java.lang.Math;

public class Point2D {
	double x;
	double y;
	
	public Point2D() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void getDetails() {
		System.out.println("x: "+ x + "y: "+ y);
	}
	
	public boolean isEqual(Point2D p1) {
		if(this.x==p1.x && this.y ==p1.y)
			return true;
		else
			return false;
	}
	
	public double calculateDistance(Point2D p1){
		double distance = Math.sqrt(Math.pow(this.x - p1.x , 2.0) + Math.pow(this.y - p1.y , 2.0));
		return distance;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
