package com.findAge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FindAgeTakingInutAsString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a year in format of yyy-mm-dd");
		String brithDateString=sc.nextLine();
		
		//DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd");
		
		LocalDate brithDate=LocalDate.parse(brithDateString);
        LocalDate curDate=LocalDate.now();
		
		Period age=Period.between(brithDate, curDate);
		System.out.println("year is: "+age.getYears());

	}

}
