package com.inputArray;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =scan.nextInt();
		   if (size <= 0) {
	            System.out.println("Array size must be a positive integer.");
	            return; // Exit the program
	        }

		int[] array=new int[size];
		boolean exists=false;
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
		System.out.println("enter the element to search in given array:");
		int search=scan.nextInt();
		System.out.println(" to search element in given arrays,: ");
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==search)
			{
				exists=true;
				break;
			}
				
		}
		if(exists)
			System.out.println(" the given element "+search+ " is present in given array");
		else
			System.out.println(" the given element "+search+ " is not  present in given array");

		
	}

}
