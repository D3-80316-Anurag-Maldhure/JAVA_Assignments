package q3;

public class DrivingCostApplication {

	public static void main(String [] args) {
		DriveCostBackend dcost = new DriveCostBackend();
		
		System.out.println("Default nitialised values:");
		dcost.displayDriveCost();
		
		
		System.out.println("Taking values from user:");
		dcost.acceptDriveCostData();
		
		System.out.println("Values after Calculation:");
		dcost.displayDriveCost();
	}
}
