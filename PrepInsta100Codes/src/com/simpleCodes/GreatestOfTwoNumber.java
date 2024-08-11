package com.simpleCodes;

import java.util.Scanner;

public class GreatestOfTwoNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number:  ");
		int number1=scan.nextInt();
		System.out.println("enter the second number:  ");
		int number2=scan.nextInt();
		int greatestNumber=(number1>number2)?number1:number2;
		System.out.println("greatest number is : "+greatestNumber);
//		if(number1<number2)
//		{
//			System.out.println("greatest number is :"+number2);
//		}
//		else
//		{
//			System.out.println("greatest number is :"+number1);
//		}
	}

}
