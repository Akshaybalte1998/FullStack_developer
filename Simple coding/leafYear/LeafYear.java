package com.leafYear;

import java.util.Scanner;

public class LeafYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		    Scanner scan=new Scanner(System.in);
			System.out.println("enter the year to year is leaf year or not: ");
			int year=scan.nextInt();
			 if(year%100==0 &&year%400==0 ||  year%100!=0&&year%4==0)
				 System.out.println(year+" given year is leaf year ");
			 else
				 System.out.println(year+" given year is  not leaf year ");
			
			/*
			 * if(year%100==0 &&year%400==0)
			 * System.out.println(year+" given year is leaf year "); else
			 * if(year%100!=0&&year%4==0)
			 * System.out.println(year+" given year is leaf year ");
			 * 
			 * else System.out.println(year+" given year is  not leaf year ");
			 */
	}

}
