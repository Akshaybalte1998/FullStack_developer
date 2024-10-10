package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name : ");
		String name=sc.next();
		
	String reveseName=	reverseName(name);
		System.out.println(reveseName);
		

	}

	private static String reverseName(String name) 
	{
		int len=name.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev+=name.charAt(i);
			
		}
		return rev;
	}

}
