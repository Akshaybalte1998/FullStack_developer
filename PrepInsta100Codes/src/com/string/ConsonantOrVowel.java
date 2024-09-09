package com.string;

import java.util.Scanner;

public class ConsonantOrVowel {
	public static boolean isVowel(char charater)
	{
		char ch1=Character.toUpperCase(charater);
		return (ch1=='A'||ch1=='E');
		
	}
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		if(isVowel(ch))
			System.out.println("the given "+ch+" charater is vowel");
	}

}
