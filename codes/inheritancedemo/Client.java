package com.inheritancedemo;

public class Client {

	public static void main(String[] args) {		
		
		Vehicle[] varr=new Vehicle[3];
		varr[0]=new Car("TATA",4);
		varr[1]=new MotorCycle("Pulsar", 200);
		varr[2]=new Car("Ford",4);				
		for(int i=0;i<varr.length;i++)
		{
			Class<?> clazz = varr[i].getClass();
			if(clazz.equals(MotorCycle.class))
			{
				MotorCycle m=(MotorCycle)varr[i]; //downcasting
				m.buttonStart();
			}
			if(clazz.equals(Car.class))
			{
				Car c=(Car)varr[i];
				c.openTrunk();
			}
						
			//identify the run time type using instanceof
			/*if(varr[i] instanceof MotorCycle)
			{
				MotorCycle m=(MotorCycle)varr[i]; //downcasting
				m.buttonStart();//with explicit reference of Motorcycle type
				//((MotorCycle)varr[i]).buttonStart();  //without explicit reference of Motorcycle type
			}
			if(varr[i] instanceof Car)
			{
				Car c=(Car)varr[i];
				c.openTrunk();
			}
			varr[i].startEngine();
			varr[i].move();
			*/
		}
		
		
		
		
		//upto inheritance
		/*Car c2=new Car("TATA",4);		
		System.out.println(c2);  //toSTring is called from Car
		c2.startEngine(); // Vehicle
		c2.move();  //Vehicle
		c2.openTrunk();  //Car
		
		MotorCycle m2=new MotorCycle("Pulsar",200);
		System.out.println(m2); //MotorCycle
		m2.buttonStart(); //MotorCycle
		m2.startEngine(); //Vehicle
		m2.move(); //Vehicle*/
		
	}

}
