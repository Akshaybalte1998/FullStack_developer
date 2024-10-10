package com.advanceCodes;

import java.util.Scanner;

public class PrefectNumber {

	public static int isPrefectNumber(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		
		return sum;
		
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the   number to find number is prefect or not   :  ");
		//number and addition of factor of that number is same 
		/*
		 Consider the number 6:

		Divisors of 6 (excluding 6 itself) are: 1, 2, and 3.
		Sum of divisors: 
		1+2+3=6.
		Since the sum equals the original number, 6 is a perfect number.
		Another example, 28:

		Divisors of 28 (excluding 28 itself) are: 1, 2, 4, 7, and 14.
		Sum of divisors: 
		1+2+4+7+14=28.
	 	the sum equals the original number, 28 is also a perfect number.
		 */
		
		
		
		
		
		
		
		
		
		int number=scan.nextInt();
		
		int checkNumber=isPrefectNumber(number);
		
		if(checkNumber==number)
			System.out.println(number +" is prefect number");
		else
			System.out.println(number +" is not prefect number");

	}

}
