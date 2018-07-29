package com.niit.springdemo;

public class Car {
	private int modelNumber=0;
	private Vehicle vehicle;
public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	//	public Car(int modelNumber) {
//		//super();
//		this.modelNumber = modelNumber;
//	}
	public void disp()
	{
		System.out.println(modelNumber);

		System.out.println(vehicle.getModelNumber());
	}
//	public int getModelNumber() {
//		return modelNumber;
//	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	
}
