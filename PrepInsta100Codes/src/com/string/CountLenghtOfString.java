package com.string;

public class CountLenghtOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asiox cweicj";
		int len1=str.length();
		System.out.println(len1);
		int len=0;
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
				len++;
		}
		
		System.out.println(len);
		
	}

}
