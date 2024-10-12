package HashMap;

import java.util.HashMap;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Java Developer";
		HashMap<Character ,Integer> map=new HashMap<>();
		
		for(char ch:str.toLowerCase().toCharArray())
		{
			if(Character.isLetter(ch))
				map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}

}
