package com.advanceCodes;

import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the   number to find factor   :  ");
		int number=scan.nextInt();
		
		System.out.println("factor of "+number+" is :");
		
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	

}
