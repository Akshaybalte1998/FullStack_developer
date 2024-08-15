package com.abstractclassdemo;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Radius-"+this.radius+super.toString();
	}
	
	public void calArea()
	{
		super.setArea(3.14*this.radius*this.radius);
	}

}
