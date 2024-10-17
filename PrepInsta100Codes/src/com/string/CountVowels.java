package com.string;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="akshasgashiedoussoie";
		int count=0;
		
		for(char ch:str.toLowerCase().toCharArray())
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					System.out.println(ch);
					++count;
				}
		}
		System.out.println(count);
	}

}
