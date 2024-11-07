package com.recurssion;

public class Factorial {
	public static void fact(int number,int fact)
	{
		if(number==0)
		{
			System.out.println(fact);
			return ;
		}
		fact*=number;
		fact(number-1,fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact(5,1);
	}

}
