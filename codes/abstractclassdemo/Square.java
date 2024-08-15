package com.abstractclassdemo;

public class Square extends Shape {
	
	private double side;

	public Square(double side)
	{
		this.side=side;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Side-"+this.side+super.toString();
	}
	
	public void calArea()
	{
		super.setArea(this.side*this.side);
	}
}
