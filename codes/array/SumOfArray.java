package com.inputArray;

import java.util.Scanner;

public class SumOfArray {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =scan.nextInt();
		   if (size <= 0) {
	            System.out.println("Array size must be a positive integer.");
	            return; // Exit the program
	        }
		int sum=0;
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(" enter the "+i+" array elemnet");
			array[i]=scan.nextInt();
		}
		System.out.println("array element in given order");
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
			System.out.println(array[i]);
		}
		System.out.println("Sum of array element : "+sum);
		
	}

}
