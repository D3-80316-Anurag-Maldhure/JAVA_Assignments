import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		System.out.println("पुणेनगरीतील दक्षिण ढाबा मध्ये आपले स्वागत आहे ");
		int choice=1;
		double totalBill=0;
		
		Scanner sc = new Scanner(System.in);
		
		while(choice!=0) {
			System.out.println("कृपया खालील पर्यायमधून निवड करा व त्यासमोरील क्रमांकाची नोंद करा (Order from choices below) :");
			System.out.println("0. ऑर्डर रद्द करा व बाहेर पडा ...(Cancel order)");
			System.out.println("1. डोसा .................	(Rs. ५०)");
			System.out.println("2. समोसा ................(Rs. २०)");
			System.out.println("3. इडली ................	(Rs. ३०)");
			System.out.println("4. उपमा ................	(Rs. २५)");
			System.out.println("5. उत्तप्पम ...............	(Rs. ४०)");
			System.out.println("6. सांबार वड़ा ............	(Rs. ४०)");
			System.out.println("7. स्पेशल नारळ चटणी ......	(Rs. ५०)");
			System.out.println("8. स्पेशल नारळ मिठाई ......	(Rs. ७०)");
			System.out.println("9. खीर  ...............	(Rs. १००)");
			System.out.println("10 ..........Generate bill...........");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 0:
					totalBill = 0;
					System.out.println("आपले ऑर्डर रद्द करण्यात आले आहे. धन्यवाद! Please come again!");
					break;
				case 1:
					totalBill = totalBill + 50;
					System.out.println(" ~~~~~~~~ डोसा added to your order ~~~~~~~~ ");
					break;
				case 2:
					totalBill = totalBill + 20;
					System.out.println("  ~~~~~~~~ समोसा added to your order ~~~~~~~~ ");
					break;
				case 3:
					totalBill = totalBill + 30;
					System.out.println(" ~~~~~~~~  इडली added to your order ~~~~~~~~ ");
					break;
				case 4:
					totalBill = totalBill + 25;
					System.out.println(" ~~~~~~~~ उपमा added to your order ~~~~~~~~ ");
					break;
				case 5:
					totalBill = totalBill + 40;
					System.out.println("  ~~~~~~~~ उत्तप्पम added to your order ~~~~~~~~ ");
					break;
				case 6:
					totalBill = totalBill + 40;
					System.out.println("  ~~~~~~~~ सांबार वड़ा added to your order ~~~~~~~~ ");
					break;
				case 7:
					totalBill = totalBill + 50;
					System.out.println("  ~~~~~~~~ स्पेशल नारळ चटणी added to your order ~~~~~~~~ ");
					break;
				case 8:
					totalBill = totalBill + 70;
					System.out.println(" ~~~~~~~~ स्पेशल नारळ मिठाई added to your order ~~~~~~~~ ");
					break;
				case 9:
					totalBill = totalBill + 100;
					System.out.println(" ~~~~~~~~ खीर added to your order ~~~~~~~~ ");
					break;
				case 10:
					System.out.println("***********************************");
					System.out.println(" आपले संपूर्ण BILL AMOUNT : Rs. " + totalBill);
					System.out.println("***********************************");
					choice = 0;
					break;
				default:
					System.out.println(" ~~~~~~~~ Enter a valid choice from above menu! ~~~~~~~~ ");
					break;
			}
		}
	}

}
