package com.table;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		  System.out.println("enter the number to print table : ");
		  int number=scan.nextInt();
		  int multi=0;
		  for(int i=1;i<=10;i++)
		  {
			  multi=number *i;
			  System.out.println(number +" * "+i +" = "+multi);
		  }
		 
	}

}
