package com.arrays;

import java.util.Scanner;

public class OddEvenArray {

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
		
		
		//counting how may even number and how many odd number is in the given array
		int evenIndex=0,oddIndex=0;
		
		for(int forCount:arr) {
			if(forCount%2==0)
				evenIndex++;
			else
				oddIndex++;
		}
		
		
		//create two new array to store the odd and even values separte
		int[] evenArray=new int[evenIndex];
		int[] oddArray=new int[oddIndex];
		int newEvenIndex=0,newOddIndex=0;
		
		//storing the values of even and odd array in new array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			    {
					evenArray[newEvenIndex]=arr[i];
					newEvenIndex++;
			    }
			else
				{
					oddArray[newOddIndex]=arr[i];
					newOddIndex++;

				}
		} 
		
		//printing even array
		System.out.println(" ");
		System.out.println("Printing Even numbers: ");
		for( int printEven:evenArray)
		{
			System.out.print(printEven+"  ");
		}
		
		//printing odd array
		System.out.println(" ");
		System.out.println("Printing Odd numbers: ");

		for( int printOdd:oddArray)
		{
			System.out.print(printOdd+"  ");
		}
		
		
		
		
	}

}
