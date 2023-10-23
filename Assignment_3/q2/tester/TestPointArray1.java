package tester;

import q2.Point2D;
import java.util.Scanner;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of points you want to enter: ");
		Point2D[] points=new Point2D[sc.nextInt()];
		
		for(int i=0; i<points.length; i++) {
			points[i] = new Point2D();
			System.out.println("Point "+i+" :");
			points[i].accept();
		}
		
		int choice=0;
		
		
		while(choice!=4) {
			System.out.println("Select the operation you would like to perform: ");
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. User i/p : 2 indices for the points , validate the indices");
			System.out.println("4. Exit");
			
			choice = sc.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter the index of the point you want to search (0 based indexing): ");
					int indexToSearch = sc.nextInt();
					for(int i=0; i<points.length;i++) {
						if(i==indexToSearch) {
							System.out.print("The point at index "+i+" is => ");
							points[i].display();
						}
						else if(indexToSearch >= points.length) {
							System.out.println("Invalid index , pls retry!!!");
							break;
						}
					}
					break;
				case 2:
					for(int i=0; i<points.length;i++) {
						System.out.print("Point "+i+" = ");
						points[i].display();
					}
					break;
				case 3:
					int start, end;
					System.out.println("Enter the index of the start point (0 based indexing): ");
					start = sc.nextInt();
					System.out.println("Enter the index of the end point (0 based indexing): ");
					end = sc.nextInt();
					
					if(points[start].isEqual(points[end])) {
						System.out.println("Both the points are coinciding / lie on the same position");
					}
					else{
						System.out.println("Both the points are not coinciding / lie at different positions");
						System.out.println("Distance between two points is = " + points[start].calculateDistance(points[end]));
					}
					break;
				case 4:
					System.out.println("Thank you for using our app!");
					choice =4;
					break;
				default:
					System.out.println("Please enter a valid choice!");
					break;
				
			}
		
		}

	}
}