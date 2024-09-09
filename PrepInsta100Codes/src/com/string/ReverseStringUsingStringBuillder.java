package com.string;

import java.util.Scanner;

public class ReverseStringUsingStringBuillder {

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name : ");
		String name=sc.next();
		StringBuilder sb=new StringBuilder(name);
		sb.reverse();
		System.out.println(sb);
	}

}
