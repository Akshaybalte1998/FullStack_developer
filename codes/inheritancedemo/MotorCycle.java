package com.inheritancedemo;

public class MotorCycle extends Vehicle {
	
	private int engineDisplacement;
	
	public MotorCycle()
	{
		this.engineDisplacement=0;
	}
	
	public MotorCycle(String brand,int engineDisplacement) {
		super(brand);
		this.engineDisplacement=engineDisplacement;
	}

	public int getEngineDisplacement() {
		return engineDisplacement;
	}

	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " Engine Displacement-"+this.engineDisplacement;
	}
	
	public void buttonStart()
	{
		System.out.println("Motorcycle is started");
	}

	@Override
	public void startEngine() {
		System.out.println(super.getBrand()+" Motorcycle engine started");
	}
	
	@Override
	public void move() {
		System.out.println(super.getBrand()+" Motorcycle is moving");
	}
}
