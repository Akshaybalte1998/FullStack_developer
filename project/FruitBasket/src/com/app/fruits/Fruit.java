package com.app.fruits;

public class Fruit {
	
	private String name;
	private String colour;
	private double weight;
    private boolean fresh ;

	
	public Fruit(String name,String colour,double weight,boolean fresh)
	{
		this.name=name;
		this.colour=colour;
		this.weight=weight;
		this.fresh=fresh;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public boolean isFresh() {
		return fresh;
	}


	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}


	@Override
	public String toString() {
		return "Fruit [name=" + name + ", colour=" + colour + ", weight=" + weight + ", fresh=" + fresh + "]";
	}
	
	public String taste()
	{
		return "no specific taste";
	}

	
	
	
	
	
	
	
	

}
