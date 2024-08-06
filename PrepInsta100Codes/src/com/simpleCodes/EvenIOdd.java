package com.simpleCodes;

import java.util.Scanner;

public class EvenIOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to check number is postive or neagtive ot zero ");
		int number=scan.nextInt();
		if(number%2==0)
			System.out.println("the given number is even number ");
		else
			System.out.println("the given number is odd number ");
	}
	

}
