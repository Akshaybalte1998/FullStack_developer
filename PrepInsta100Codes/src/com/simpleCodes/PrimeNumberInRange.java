package com.simpleCodes;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the  number to check prime or not :  ");
		int number=scan.nextInt();
		if(number==1)
		{
			System.out.println(" 1 is not prime number or not composite number");
			return ;
		}
		boolean flag=false;
		//checking prime or not
	
		System.out.println(" prime number in between 2 to "+number +" are: ");
		for(int i=2;i<=number;i++)
		{
			flag=false;
			
			for(int j=2;j<=(i/2);j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
				System.out.print(i+" ");
		}

	}

}
