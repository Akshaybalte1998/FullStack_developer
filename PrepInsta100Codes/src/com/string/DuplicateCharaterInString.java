package com.string;

import java.util.HashMap;

public class DuplicateCharaterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asasbduadbiadakdnjaosasddasff";
		HashMap<Character,Integer> map=new HashMap<>();
		for(char ch:str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				int count =map.get(ch);
				count++;
			}
			else
				map.put(ch,0);
		}
		System.out.println(map);
		
	}

}
