package q1;

public class CreditLimitCalculator {

	public static void main(String[] args) {
		ChargeAccount cac =new ChargeAccount();
		
		cac.acceptChargeAccountDetails();
		cac.displayChargeAccountDetails();
		cac.checkIfCreditLimitExceeded();
	}

}
