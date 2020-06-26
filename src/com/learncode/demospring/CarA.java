package com.learncode.demospring;

public class CarA implements Car {

private String message = "Price for Car A starts from 5L";
	@Override
	public void getPrice() {
		System.out.println(message);
		//SOP Statement

	}

}
