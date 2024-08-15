package com.inputArray;

import java.util.Scanner;

public class SortArrayAscendingDscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =scan.nextInt();
		   if (size <= 0) {
	            System.out.println("Array size must be a positive integer.");
	            return; // Exit the program
	        }
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(" enter the "+i+" array elemnet");
			array[i]=scan.nextInt();
		}
		System.out.println("array element in given order");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//ascending order
	
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		
		
		System.out.println(" ascending order : ");

		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		//decsneding order
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]>array[i])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	  
		System.out.println(" descending order : ");

		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
		
		
		

	}

}
