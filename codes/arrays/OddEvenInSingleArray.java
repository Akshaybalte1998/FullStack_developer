package com.arrays;

import java.util.Scanner;

public class OddEvenInSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
Scanner scan=new Scanner(System.in);
		
		
		//giving the size of an array
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		
		int[]arr=new int[size];
		
		
		//taking input from user
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the "+i+" element: ");
			arr[i]=scan.nextInt();
			
		}
		
		//display the array
		System.out.println(" arrays size is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]+" ");
		
			
		}
		
		
		//Adding  even element and odd element in new single array
		System.out.println(" ");
		int[] evenOddArray=new int[size];
		int evenIndex=0,oddIndex=0;
		
		for(int combine:arr)
		{
			if(combine%2==0)
			{
				evenOddArray[evenIndex++]=combine;
				
			}
		}
		oddIndex=evenIndex;
		
		for(int combine:arr)
		{
			if(combine%2!=0)
			{
				evenOddArray[oddIndex++]=combine;
				
			}
		}
		
		
		//printing new combine array
		System.out.println("Printing combine array : ");
		for(int printNewArray:evenOddArray)
		{
			System.out.print(printNewArray+" ");
		}
		
		
		
		
		
		
		
	}

}
