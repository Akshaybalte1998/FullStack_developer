package com.recurssion;

public class Number {
	public static void printNumber(int n)
	{
		if(n==0)
		{
			return ;
		}
		System.out.println(n);
		printNumber(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number=10;
		printNumber(number);
	}

}
