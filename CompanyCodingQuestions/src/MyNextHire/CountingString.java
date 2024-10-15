package MyNextHire;

import java.util.HashMap;
import java.util.TreeMap;

public class CountingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Java Developer";
		str=str.toLowerCase();
		TreeMap<Character ,Integer> map=new TreeMap<>();
		
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
				map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}

}
