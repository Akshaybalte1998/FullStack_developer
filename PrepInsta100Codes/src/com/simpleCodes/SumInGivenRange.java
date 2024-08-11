package com.simpleCodes;

import java.util.Scanner;

public class SumInGivenRange {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number where range start:  ");
		int startRange=scan.nextInt();
		System.out.println("enter the number where range end:  ");
		int endRange=scan.nextInt();
		int sum=0;
		for(int i=startRange;i<=endRange;i++)
		{
			sum+=i;
		}
		System.out.println(" sum of the given range is :"+sum);
	}

}
