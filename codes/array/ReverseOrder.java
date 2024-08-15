package com.inputArray;

import java.util.Scanner;

public class ReverseOrder {

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
		//reverse order
		System.out.println("array element in rever  order");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}


	}

}
