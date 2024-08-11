package com.simpleCodes;

import java.util.Scanner;

public class SumOfDigit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  number:  ");
		int number=scan.nextInt();
		int sum=0;
		//to get  sum of digit
		while(number>0)
		{
			int temp=number%10;
			sum+=temp;
			number/=10;
		}
		
		System.out.println("the sum of all digitis :"+sum);
	}

}
