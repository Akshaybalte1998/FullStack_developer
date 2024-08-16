package com.calculator;

import java.util.Scanner;

public class Calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		
		boolean exit=false;
		int choice;
		while(!exit)
		{
			System.out.println("enter the two number for performing below opertion: ");
			int number1=scan.nextInt();
			int number2=scan.nextInt();
			System.out.println("enter the choice :");
			System.out.println("1. Addition ");
			System.out.println("2. substraction ");
			System.out.println("3. multiplication");
			System.out.println("4. division  ");
			System.out.println("5.exit ");
			System.out.println(" enter the choice:");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("addition of two number : "+(number1+number2));
				break;
			case 2:
				System.out.println("substraction of two number : "+(number1-number2));

				break;
			case 3:
				System.out.println("multiplication of two number : "+(number1*number2));

				break;
			case 4:
				if(number2!=0)
				System.out.println("division of two number : "+(number1/number2));

				break;
			case 5:
				exit=true;
				break;
			
			
			
			
			
			
			
			}
			
			
			
			
			
			
		}
		
		
	}

}
