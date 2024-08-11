package com.simpleCodes;

import java.util.Scanner;

public class LeafYear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year:  ");
		int year=scan.nextInt();
		if(year%400==0)
			System.out.println(year +" is leaf year");
		else if(year%4==0&&year%100!=0)
			System.out.println(year +" is leaf year");
		else 
			System.out.println(year +" is leaf year");
	}

}
