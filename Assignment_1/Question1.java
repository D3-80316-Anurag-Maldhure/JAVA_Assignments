import java.util.Scanner;

public class Question1{
	public static void main(String[] args) {
		int number;
		Scanner sc =new Scanner(System.in);
		System.out.println("java Test");
		System.out.print("Enter a Number : ");
		number = sc.nextInt();
		System.out.println("Given Number : " + number);
		System.out.println("Binary equivalent : " + Integer.toBinaryString(number));
		System.out.println("Octal equivalent : " + Integer.toOctalString(number));
		System.out.println("Hexadecimal equivalent : " + Integer.toHexString(number));
	}
}