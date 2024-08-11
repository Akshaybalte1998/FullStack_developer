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
		
		int number=scan.nextInt();
		
		int checkNumber=isPrefectNumber(number);
		
		if(checkNumber==number)
			System.out.println(number +" is prefect number");
		else
			System.out.println(number +" is not prefect number");

	}

}
