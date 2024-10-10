package com.app.fruits;

public class Mango extends Fruit{
	public Mango(String name,String colour,double weight,boolean fresh)
	{
		super(name,colour,weight,fresh);
	}
	@Override
	public String taste()
	{
		return "sweet";
	}
	@Override
	public String toString()
	{
		return super.toString();
	}
	//In Mango : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
	public void pulp()
	{
		System.out.println("name: "+getName()+" creating pulp");
	}

}
