package com.recurssion;

public class Power {
	public static int power(int base,int expo)
	{
		
		if(expo==0)
		{
			return 1;
		}
		if(base==0)
		{
			return 0;
		}
		return base*power(base,expo-1);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=power(5,3);
		System.out.println(result);
	}

}
