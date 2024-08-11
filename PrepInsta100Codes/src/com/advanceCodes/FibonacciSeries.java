package com.advanceCodes;

import java.util.Scanner;

public class FibonacciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first  number:  ");
		int number1=scan.nextInt();
		System.out.println("enter the second  number:  ");
		int number2=scan.nextInt();
		System.out.println("enter the   number upto print series:  ");
		int uptoNumber=scan.nextInt();
		
		System.out.println("the fibonacci series ");
		System.out.print(number1+","+number2+",");
		for(int i=3;i<=uptoNumber;i++)
		{
			int number3=number1+number2;
			System.out.print(number3+",");
			number1=number2;
			number2=number3;
		}
	}

}
