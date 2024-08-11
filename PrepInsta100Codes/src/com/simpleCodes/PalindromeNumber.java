package com.simpleCodes;

import java.util.Scanner;

public class PalindromeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  number:  ");
		int number=scan.nextInt();
		int beforereverse=number;
		int afterReverse=0;
		
		//reverse the number to check for it is palidrome or not
		
		while(number>0)
		{
			int temp=number%10;
			afterReverse=afterReverse*10+temp;
			number=number/10;
			
		}
		if(beforereverse==afterReverse)
		{
			System.out.println("the number is before reverse: "+beforereverse+" and number is after reverser: "+afterReverse);
			System.out.println("the number is pelindrome number");
		}
		else
			System.out.println(" number is not pelidrome number");
	}

}
