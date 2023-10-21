
public class Invoice {
	String partNumber;
	String partDescription;
	int quantityOfTheItem;
	double pricePerItem;
	
	double invoiceAmount;

	//Constructor
	public Invoice() {
		this.partNumber = "Temp001";
		this.partDescription = "TempDescription";
		this.quantityOfTheItem = 100;
		this.pricePerItem = 21.21;
		this.invoiceAmount = quantityOfTheItem*invoiceAmount;
	}

	//Getters and setters
	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantityOfTheItem() {
		return quantityOfTheItem;
	}

	public void setQuantityOfTheItem(int quantityOfTheItem) {
		//If the quantity is not positive, it should be set to 0.
		if(quantityOfTheItem<0) {
			this.quantityOfTheItem = 0;
		}
		else {
			this.quantityOfTheItem = quantityOfTheItem;
		}
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		//If the price per item is not positive, it should be set to 0.0.
		if(pricePerItem<0) {
			this.pricePerItem = 0.0;
		}
		else {
			this.pricePerItem = pricePerItem;
		}

	}
	
	public double getInvoiceAmount() {
		this.invoiceAmount = getQuantityOfTheItem()*getPricePerItem();
		return invoiceAmount;
	}
	
}
