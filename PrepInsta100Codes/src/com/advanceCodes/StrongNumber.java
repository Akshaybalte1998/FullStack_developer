package com.advanceCodes;

import java.util.Scanner;

public class StrongNumber {
	
	public static int isStrong(int tempNumber) 
	{
		int sum=0;
		while(tempNumber>0)
		{
			int singleNumber=tempNumber%10;
			int fact=factorial(singleNumber);
			sum=sum+fact;
			tempNumber=tempNumber/10;
		}
		return sum; 
	}

	public static int factorial(int digit)
	{
		int fact1=1;
		for(int i=1;i<=digit;i++)
		{
			fact1=fact1*i;
		}
		return fact1;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the   number to find number is strong or not   :  ");
		int number=scan.nextInt();
	    
		//145:
		// 1 fact=1
		//4 fact=24
		//5 fact=120
		//120+24+1=145
		// calling function to return sum of given number for checking
		int checkStong=isStrong(number);
	
		
		if(checkStong==number)
			System.out.println(" number is strong number");
		else
			System.out.println(" number is not strong number");
	}

	

}



//int tempNumber = number;
//int sum = 0;
//
//while (tempNumber > 0) {
//    int singleNumber = tempNumber % 10;
//    int fact = 1;
//
//    for (int i = 1; i <= singleNumber; i++) {
//        fact = fact * i;
//    }
//
//    sum = sum + fact;
//    tempNumber = tempNumber / 10;
//}
//
//if (sum == number)
//    System.out.println(number + " is a strong number.");
//else
//    System.out.println(number + " is not a strong number.");
