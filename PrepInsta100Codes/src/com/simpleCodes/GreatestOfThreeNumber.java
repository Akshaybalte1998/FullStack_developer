package com.simpleCodes;

import java.util.Scanner;

public class GreatestOfThreeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number:  ");
		int number1=scan.nextInt();
		System.out.println("enter the second number:  ");
		int number2=scan.nextInt();
		System.out.println("enter the third number:  ");
		int number3=scan.nextInt();
		//int greatestNumber=(number1>number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
		int greatestNumber=Math.max(number1, Math.max(number2, number3));
		System.out.println("greatest number is : "+greatestNumber);
		
		int a=37;
		int b=35;
		int c=45;
		int maxAB=(a+b+Math.abs(a-b))/2;
		System.out.println(maxAB);
		int maxABC=(maxAB+c+Math.abs(maxAB-c))/2;
		System.out.println(maxABC);
	}

}
