package com.recurssion;

public class Fibonnic {
	public static void  fibonnics(int a,int b,int total)
	{
		if(total==0)
		{
			return;
		}
		int c=a+b;
		System.out.print(c+",");
		fibonnics(b,c,total-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=0,b=1;
		System.out.print(a+","+b+",");
		fibonnics(a,b,8);
	}

}
