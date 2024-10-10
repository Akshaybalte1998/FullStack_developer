package com.app.fruits;

public class Orange extends Fruit{

	
	public Orange( String name,String colour,double weight,boolean fresh)
	{
		super(name,colour,weight,fresh);
	}
	@Override
	public String taste()
	{
		return " sour";
	}
	
	//In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}

	public void juice1()
	{
		System.out.println("Name :"+getName()+" extracting juice  ");
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	public void juice() {
		// TODO Auto-generated method stub
		System.out.println("Name :"+getName()+" extracting juice  ");
	}
	

}
