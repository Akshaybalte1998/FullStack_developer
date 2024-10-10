package com.advanceCodes;

import java.util.Scanner;

public class AmstrongNumber {

	public static int isAmstrong(int number)
	{
		int count=isCount(number);
		int totalSum=0;
		int tempNumber=number;
		while(tempNumber>0)
		{
			int temp=tempNumber%10;
			int sum=isPower(temp,count);
			totalSum=totalSum+sum;
			tempNumber=tempNumber/10;
		}
		return totalSum;
	}
	
	public static int isPower(int base,int expo)
	{
		int total=1;
		for(int i=1;i<=expo;i++)
		{
			total=total*base;
		}
		return total;
	}
	
	public static int isCount(int forCount)
	{
		int count1=0;
		while(forCount>0)
		{
			forCount=forCount/10;
			count1++;
		}
		return count1;
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the   number to find number is Amstrong or not   :  ");
		int number=scan.nextInt();
		
		//9474 
		//9 4 +4 4 +7 4 +4 4=9474  =6561+256+2401+256=

		//371
		//3^3+7^3+1^1=371
		int checkAmstrong=isAmstrong(number);
		
		if(checkAmstrong==number)
			System.out.println(number +" is amstrong number");
		else 
			System.out.println(number+" is not amstrong number");
			
		
		
	}

}


//int count=0;
//int forCountNumber=number;
//
////counting how many digit in it
//while(forCountNumber>0)
//{
//	count++;
//	forCountNumber=forCountNumber/10;
//}
//System.out.println("count is "+count);
//
//
//
////for making sum of all  digit 
//int sum=0;
//int forSumNumber=number;
//while(forSumNumber>0)
//{
//	int temp=forSumNumber%10;
//	System.out.println(" digit is "+temp);
//	int power=1;
//	
//	//getting power of that number
//	for(int i=1;i<=count;i++)
//	{
//		power=power*temp;
//	}
//	sum=sum+power;
//	System.out.println(" total sum is: "+sum);
//	forSumNumber=forSumNumber/10;
//}
//	
//if(sum==number)
//	System.out.println("number is amstrong number");
//else
//	System.out.println("number is  not amstrong number");
