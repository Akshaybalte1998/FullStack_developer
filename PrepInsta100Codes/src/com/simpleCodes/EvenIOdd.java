package com.simpleCodes;

import java.util.Scanner;

public class EvenIOdd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to check number is even or odd ");
		int number=scan.nextInt();
		if(number%2==0)
			System.out.println("the given number is even number ");
		else
			System.out.println("the given number is odd number ");
	}
	

}
