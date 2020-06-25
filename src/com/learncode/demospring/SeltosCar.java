package com.learncode.demospring;

public class SeltosCar implements Car {
	private String details = "The price of Kia Seltos starts at Rs. 9.89 Lakh and goes upto Rs. 17.34 Lakh."
							+"The price of petrol variant of Seltos ranges between Rs. 9.89 Lakh to Rs. 17.34 Lakh."
							+"The prices of Seltos diesel variants start at Rs. 10.34 Lakh and the top-end diesel is priced at Rs. 17.34 Lakh.";
	//Information provided in the message can be wrong
	
	@Override
	public void getPrice() {
	
		System.out.println(details);

	}

}
