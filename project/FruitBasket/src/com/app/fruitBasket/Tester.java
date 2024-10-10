package com.app.fruitBasket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;
import com.app.collectionUilts.populatedList;
public class Tester {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
//		 System.out.println("enter the size of an array list");
//		 int size=scan.nextInt();
		List<Fruit> basket=new ArrayList<>();
		boolean exit=false;
		int choise ;
		while(!exit)
		{
			System.out.println("1.add mango");
			System.out.println("2.add apple");
			System.out.println("3.add orange");

			System.out.println("4.to display");
			
			System.out.println("enter the choise");
			choise=scan.nextInt();
			switch(choise)
			{
			case 1:
				//basket.add(new Mango("Mango","yellow",0.800,true));
				System.out.println("enter the mango name");
				String name=scan.next();
				System.out.println("enter the colour ");
				String colour=scan.next();
				System.out.println("enter the weight of mango");
				double weight =scan.nextDouble();
				System.out.println("enter fresh is fresh(true)or not(false)");
				boolean fresh=scan.nextBoolean();
				Mango mango=new Mango(name,colour,weight,fresh);
				//basket.add();
				basket.add(mango);
				break;
		
			case 2:
		
				basket=populatedList.collectionOfAlll();
				break;
			case 3:
				System.out.println(" enter name,colour , weight ,fresh(true/false)");
				basket.add(new Orange(scan.next(),scan.next(),scan.nextDouble(),scan.nextBoolean()));
				break;
				
			
			
			case 4:
				//basket.forEach(s->System.out.println(s));
				for(Fruit l:basket)
					System.out.println(l);
					
				break;
				
			case 5:
				System.out.println(" display all fruit  which is fresh:");
				for(Fruit f:basket)
				{
					if(f.isFresh()==true)
						System.out.println(f.getColour()+f.getWeight()+f.taste());
				}
				break;
			
			case 6:
				System.out.println("enter the index");
				int index=scan.nextInt();
				if(index>=0 && index<basket.size())
				{
					basket.get(index).setFresh(false);
					
				}
				else
				System.out.println("invalid index");
				
				break;
			case 7:
				  for (Fruit fruit : basket) {
			            if (fruit instanceof Orange && fruit.taste().equals("sour")) {
			                fruit.setFresh(false);
			            }
			        }
				break;
			case 8:
			    // Invoke fruit specific functionality
		        System.out.println("Enter the index of the fruit to perform specific functionality:");
		        int funcIndex = scan.nextInt();
		        if (funcIndex >= 0 && funcIndex < basket.size()) {
		            Fruit fruit = basket.get(funcIndex);
		            if (fruit instanceof Mango) {
		            	Mango M=(Mango)fruit;
		            	M.pulp();
		                //((Mango) fruit).pulp();
		            } 
		            else if (fruit instanceof Orange)
		            {
		            	Orange o=(Orange)fruit;
		            	((Orange) o).juice();
		                //((Orange) fruit).juice();
		            }
		            else if (fruit instanceof Apple)
		            {
		                ((Apple) fruit).jam();
		            }
		        } else {
		            System.out.println("Invalid index.");
		        }
				
				break;
			case 9:
				exit=true;
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
