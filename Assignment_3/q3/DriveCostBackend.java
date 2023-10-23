package q3;

import java.util.Scanner;

public class DriveCostBackend {
	double totalMilesPerDay;
	double costPerGallon;
	double averageMilesPerGallon;
	double parkingFeesPerDay;
	double tollsPerDay;
	double costPerDay;
	
	public DriveCostBackend() {
		totalMilesPerDay = 0;
		costPerGallon = 0;
		averageMilesPerGallon = 0;
		parkingFeesPerDay = 0;
		tollsPerDay = 0;
		costPerDay = 0;
	}
	
	public void acceptDriveCostData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total miles driven per day : ");
		totalMilesPerDay = sc.nextDouble();
		System.out.println("Cost per gallon of gasoline : ");
		costPerGallon = sc.nextDouble();
		System.out.println("Average miles per gallon : ");
		averageMilesPerGallon = sc.nextDouble();
		System.out.println("Enter parking fees per day : ");
		parkingFeesPerDay = sc.nextDouble();
		System.out.println("Enter the tolls per day : ");
		tollsPerDay = sc.nextDouble();
		
		calculateDriveAssociatedCosts();
	}
		
	public void calculateDriveAssociatedCosts() {
		costPerDay = ((totalMilesPerDay/averageMilesPerGallon)*costPerGallon)+parkingFeesPerDay+tollsPerDay;
		
	}
	
	public void displayDriveCost() {
		System.out.println("-------------------------------------------------");
		System.out.println("Cost per day of driving to work : " + costPerDay);
		System.out.println("-------------------------------------------------");
		System.out.println("Drive Cost Details : ");
		System.out.println("Total miles driven per day : " + totalMilesPerDay);
		System.out.println("Cost per gallon of gasoline : " + costPerGallon);
		System.out.println("Average miles per gallon : " + averageMilesPerGallon);
		System.out.println("Parking fees per day : " + parkingFeesPerDay);
		System.out.println("Tolls per day : " + tollsPerDay);
		System.out.println("-------------------------------------------------");
	}
}
