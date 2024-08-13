package com.findAge;

import java.time.LocalDate;
import java.time.Period;

public class FindAge {

	public static void main(String[] args)
	{
		//LocalDate birthDate=LocalDate.of(1998,10,24);
		LocalDate curDate=LocalDate.now();
			LocalDate birthDate=LocalDate.parse("1998-10-24");
		
		Period age=Period.between(birthDate, curDate);
		System.out.println(age.getYears());
		System.out.println(age.getMonths());
		System.out.println(age.getDays());

	}

}
