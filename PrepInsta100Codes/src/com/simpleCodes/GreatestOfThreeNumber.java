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
		int greatestNumber=(number1>number2)?((number1>number3)?number1:number3):((number2>number3)?number2:number3);
		System.out.println("greatest number is : "+greatestNumber);
	}

}
