
public class InvoiceTest {

	public static void main(String[] args) {
		//Create an invoice object
		Invoice invoice= new Invoice();
		
		//Default field values
		System.out.println("Default field values =>");
		System.out.println("Part Number :      " + invoice.getPartNumber());
		System.out.println("Part Number :      " + invoice.getPartDescription());
		System.out.println("Quantity of Item : " + invoice.getQuantityOfTheItem());
		System.out.println("Price per Item :   " + invoice.getPricePerItem());
		System.out.println("Invoice Amount :   " + invoice.getInvoiceAmount());
		System.out.println("----------------------------------------");
		
		
		//Set fields of that object to CORRECT VALUES
		invoice.setPartNumber("AA10001");
		invoice.setPartDescription("AMOLED+ Display screen 1080*1920");
		invoice.setQuantityOfTheItem(1000);
		invoice.setPricePerItem(6888.11);
		
		//Default field values
		System.out.println("Default field values =>");
		System.out.println("Part Number :      " + invoice.getPartNumber());
		System.out.println("Part Number :      " + invoice.getPartDescription());
		System.out.println("Quantity of Item : " + invoice.getQuantityOfTheItem());
		System.out.println("Price per Item :   " + invoice.getPricePerItem());
		System.out.println("Invoice Amount :   " + invoice.getInvoiceAmount());
		System.out.println("----------------------------------------");
		
		//Set fields of that object to INCORRECT VALUES
		invoice.setPartNumber("AA10001");
		invoice.setPartDescription("AMOLED+ Display screen 1080*1920");
		invoice.setQuantityOfTheItem(-7000);
		invoice.setPricePerItem(-6888.11);
		
		//Default field values
		System.out.println("Default field values =>");
		System.out.println("Part Number :      " + invoice.getPartNumber());
		System.out.println("Part Number :      " + invoice.getPartDescription());
		System.out.println("Quantity of Item : " + invoice.getQuantityOfTheItem());
		System.out.println("Price per Item :   " + invoice.getPricePerItem());
		System.out.println("Invoice Amount :   " + invoice.getInvoiceAmount());
		System.out.println("----------------------------------------");
			
	}

}
