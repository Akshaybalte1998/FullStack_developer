package com.recurssion;

public class Sum {
	public static void  totalSum(int number,int sum)
	{
		if(number==0) {
			System.out.println(sum);
			return ;
		}
		sum+=number;
		totalSum(number-1,sum);
		System.out.println(number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		totalSum(n ,0);
		
	}

}
