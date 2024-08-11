package com.simpleCodes;

import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  number to check prime or not :  ");
		int number=scan.nextInt();
		if(number==1)
		{
			System.out.println(" 1 is not prime number or not composite number");
			return ;
		}
		boolean flag=false;
		//checking prime or not
		for(int i=2;i<=(number/2);i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
			System.out.println(number+" is a not prime number");
		else
			System.out.println(number+" is  a prime number");

	}

}
