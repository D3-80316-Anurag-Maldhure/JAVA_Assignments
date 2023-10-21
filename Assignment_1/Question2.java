import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter the first number: ");
	        if (scanner.hasNextDouble()) {
	        	Double num1 = scanner.nextDouble();
	            scanner.nextLine(); // Consume the newline character
	            System.out.println("Enter the second number: ");
	            if (scanner.hasNextDouble()) {
	            	Double num2 = scanner.nextDouble();
	                scanner.close(); // Close the scanner

	                Double average = (num1 + num2) / 2;
	                System.out.println("Average of " + num1 + " and " + num2 + " is: " + average);
	            }else {
	                System.out.println("Error: Second input is not a double.");
	            }
	        }else {
	            System.out.println("Error: First input is not a double.");
	    }
	}
}

