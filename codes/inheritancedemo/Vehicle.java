package com.inheritancedemo;

public class Vehicle {
	
	//define the general fields/attributes
	private String brand;
	
	public Vehicle()
	{
		this.brand="NA";
	}
	
	public Vehicle(String brand)
	{
		this.brand=brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Brand-"+this.brand;
	}

	public void startEngine()
	{
		System.out.println("Vehicle is started");
	}
	
	public void move()
	{
		System.out.println("Vehicle is moving");
	}
	public final void applyHorn()
	{
		System.out.println("Horn is applied");
	}
	
}
