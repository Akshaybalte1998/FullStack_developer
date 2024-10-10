package com.app.fruits;


public class Apple extends Fruit{
	
	public Apple( String name,String colour,double weight,boolean fresh)
	{
		super(name,colour,weight,fresh);
	}
	@Override
	public String taste()
	{
		return "sweet and sour";
	}
	
	//In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}

	public void jam()
	{
		System.out.println("Name :"+getName()+" we creating jam  ");
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	

}
