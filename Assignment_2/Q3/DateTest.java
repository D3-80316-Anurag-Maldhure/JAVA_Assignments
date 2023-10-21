import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Date d1 = new Date();
		Scanner sc = new Scanner(System.in);
		
		//Display default date
		System.out.println("--------------------------");
		System.out.println("Display default date:");
		d1.displayDate();
		System.out.println("--------------------------");

				
		//Set new date 
		System.out.println("Set new date:");
		System.out.println("Enter day: ");
		d1.setDay(sc.nextInt());
		System.out.println("Enter month: ");
		d1.setMonth(sc.nextInt());
		System.out.println("Enter year: ");
		d1.setYear(sc.nextInt());
		
		
		System.out.println("--------------------------");
		System.out.println("Updated date:");
		d1.displayDate();
		System.out.println("--------------------------");
	}
}
