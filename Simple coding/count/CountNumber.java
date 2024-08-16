package com.count;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter the number : ");
	  int number=scan.nextInt();
	  int count=0;
	  while(number>0)
	  {
		  number=number/10;
		  count++;
	  }
		System.out.println("count of given number is : " +count);
		
		
	}

}
