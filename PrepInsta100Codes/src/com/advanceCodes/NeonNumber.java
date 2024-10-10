package com.advanceCodes;

import java.util.Scanner;

public class NeonNumber {

	public static int isNeonNumber(int num)
	{
		int sum=0;
		while(num>0)
		{
			int temp=num%10;
			sum+=temp;
			num/=10;
		}
		
		return sum;
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the   number to find number is neon number or not  :  ");
		int number=scan.nextInt();
		// 9^2=81   8+1=9
		
		int checkNumber=isNeonNumber(number);
		
		if(checkNumber==number)
			System.out.println(number +" is neon number");
		else
			System.out.println(number +" is not neon number");
	}

}
