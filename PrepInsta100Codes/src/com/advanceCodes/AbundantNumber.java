package com.advanceCodes;

import java.util.Scanner;

public class AbundantNumber {

	public static int isAbundantNumber(int num)
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
		System.out.println("enter the   number to find number is Abundant or not   :  ");
		//number is less than sum of factor 
		
		int number=scan.nextInt();
		
		int checkNumber=isAbundantNumber(number);
		
		if(checkNumber>number)
			System.out.println(number +" is Abundant number");
		else
			System.out.println(number +" is not Abundant number");

	}

}
