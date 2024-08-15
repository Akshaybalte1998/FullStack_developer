package com.inputArray;

import java.util.Scanner;

public class ArrayInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =scan.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			System.out.println(" enter the "+i+" array elemnet");
			array[i]=scan.nextInt();
			
		}
		System.out.println("array elements are: ");
		
		for(int p:array)
			System.out.print(p+" ");
			
		
		
	}

}
