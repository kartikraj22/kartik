
package com.sapient.beans;

public class Car {
	
	private int carID;
	private String carName;
	private double price;

	public Car(int carID) {
		super();
		this.carID = carID;
		System.out.println("one arg called");
	}


	public Car(int carID, String carName) {
		this(carID);
		this.carName = carName;
		System.out.println("2 arg cons called");
	}


	public Car(int carID, String carName, double price) {
		this(carID,carName);
		this.price = price;
		System.out.println("3 arg cons called");
	}
	public void display(){
		System.out.println(carID+ " " + carName + " " + price);
	}
	
	
} 
