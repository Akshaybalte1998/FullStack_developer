package com.ifElse;

import java.util.Scanner;

public class TaxCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan=new Scanner(System.in);
		  System.out.println("enter the number to print table : ");
		  double salary=scan.nextDouble();
		double tax;
		double taxAmount;
		if(salary<10000)
		{
			System.out.println("no Tax" );
			
		}
		else if(salary>=10000&&salary<=50000)
		{
			tax=0.10;
			taxAmount=salary*tax;
			System.out.println("salary: "+salary+" tax: "+tax+" taxAmount : "+taxAmount);
		}
		else if(salary>50000&&salary<=200000)
		{
			tax=0.20;
			taxAmount=salary*tax;
			System.out.println("salary: "+salary+" tax: "+tax+" taxAmount : "+taxAmount);
		}
		else
		{
			tax=0.30;
			taxAmount=salary*tax;
			System.out.println("salary: "+salary+" tax: "+tax+" taxAmount : "+taxAmount);
		}
		
		
	}

}
