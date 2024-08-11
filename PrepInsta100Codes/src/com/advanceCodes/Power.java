package com.advanceCodes;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  base number  :  ");
		int baseNumber=scan.nextInt();
		System.out.println("enter the  exponent number  :  ");
		int expoNumber=scan.nextInt();
		int total=1;
		for(int i=1;i<=expoNumber;i++)
		{
			total*=baseNumber;
		}
		System.out.println(baseNumber+" raised to power of " +expoNumber+" is : "+total);
	}

}
