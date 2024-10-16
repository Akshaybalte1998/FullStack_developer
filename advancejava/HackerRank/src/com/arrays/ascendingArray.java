package com.arrays;

import java.util.Scanner;

public class ascendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=scan.nextInt();
		
		int[]arr=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the "+i+" element: ");
			arr[i]=scan.nextInt();
			
		}
		System.out.println(" arrays size is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]+" ");
		
			
		} 
	}

}
