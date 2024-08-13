package com.findAge;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FindAgeTakingInputFromUser {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year :");
		int year=sc.nextInt();
		System.out.println("enter the month :");
		int month=sc.nextInt();
		System.out.println("enter the date :");
		int date=sc.nextInt();
		
		LocalDate birthDate= LocalDate.of(year,month,date);
		LocalDate curDate=LocalDate.now();
		
		Period age=Period.between(birthDate, curDate);
		System.out.println("year is: "+age.getYears());
	}

}
