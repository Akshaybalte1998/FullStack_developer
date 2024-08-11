package com.simpleCodes;

import java.util.Scanner;

public class ReverseNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number:  ");
		int number=scan.nextInt();
		
		int reverse=0;
		int beforeReverse=number;
		//revere the number using whille loop
		while(number>0)
		{
			int temp=number%10;
			reverse=reverse*10+temp;
			number=number/10;
			
		}
		
		//printing reverse number
		System.out.println("the reverse number of given number "+beforeReverse +" is : "+reverse );
	}

}
