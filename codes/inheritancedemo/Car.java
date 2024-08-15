package com.inheritancedemo;

public class Car extends Vehicle
{
	//define the special properaties and methods
	private int noOfDoors;
	
	public Car()
	{
		this.noOfDoors=0;
	}
	public Car(String brand,int noOfDoors)
	{
		super(brand);  //super.ctor(brand)
		this.noOfDoors=noOfDoors;
	}
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +" No of doors-"+this.noOfDoors;
	}
	public void openTrunk()
	{
		System.out.println("Car trunk is opened");
	}

	@Override
	public void startEngine() {
		System.out.println(super.getBrand()+" Car engine is started");
	}
	@Override
	public void move() {
		System.out.println(super.getBrand()+" Car is moving");
	}
	
}
