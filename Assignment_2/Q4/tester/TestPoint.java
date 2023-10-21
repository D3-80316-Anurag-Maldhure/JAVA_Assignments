package tester;
import com.app.geometry.*;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		Scanner sc = new Scanner(System.in);
		
		//Getting the two points from user
		System.out.println("Enter point p1: ");
		System.out.println("Enter x-coordinate of p1: ");
		p1.setX(sc.nextDouble());
		System.out.println("Enter y-coordinate of p1: ");
		p1.setY(sc.nextDouble());
		System.out.println("Enter point p2: ");
		System.out.println("Enter x-coordinate of p2: ");
		p2.setX(sc.nextDouble());
		System.out.println("Enter y-coordinate of p2: ");
		p2.setY(sc.nextDouble());
		System.out.println("------------------------------");
		
		//Displaying the two points
		System.out.println("The two points are: ");
		System.out.println("Point p1: ");
		p1.getDetails();
		System.out.println("Point p2: ");
		p2.getDetails();
		System.out.println("-----------------------------------------------------------------------");
		
		//Checking equality of points
		System.out.println("Checking if the two points are equal or not: ");
		if(p1.isEqual(p2)) {
			System.out.println("Point p1 and p2 are equal / coincide / located at same position");
		}else {
			System.out.println("Point p1 and p2 are not equal / do not coincide / located at different position");
			System.out.println("Distance between two points = " + p1.calculateDistance(p2) + " units");
			
		}
		System.out.println("-----------------------------------------------------------------------");
		
		
		
	}

}
