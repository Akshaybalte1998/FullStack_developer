package com.abstractclassdemo;

public abstract class Shape {

	private double area;
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Shape() {
		this.area=0.0;		
	}
	
	public abstract void calArea();
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Area-"+this.area;
	}
}
