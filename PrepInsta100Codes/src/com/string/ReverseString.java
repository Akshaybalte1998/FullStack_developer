package com.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name : ");
		String name=sc.next();
		char[] nameArray=name.toCharArray();
		reverseName(nameArray);
		String reverseName=new String(nameArray);
		System.out.println(reverseName);

	}

	private static void reverseName(char[] n) 
	{
		int left=0;
		int right=n.length-1;
		
		while(left<right)
		{
			char temp=n[left];
			n[left]=n[right];
			n[right]=temp;
			left++;
			right--;
		}
		
	}

}
