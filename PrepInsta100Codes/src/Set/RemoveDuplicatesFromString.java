package Set;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
	
		
		
		int array[]= {10,20,30,10,20,30,40,50,30,50,40,12};
		
		HashSet<Integer> set=new HashSet<>();
		System.out.println("convert array into hashset only unique values");
		for(int i:array)
			set.add(i);
		System.out.println(set);
		
		System.out.println("\n\n\n");
		
		String[] input={ "akshay", "balte", "keshav"} ;
		
		HashSet<String> str=new HashSet<>();
		System.out.println("convert String array into hashset only unique values");
		for(String s:input)
			str.add(s);
		System.out.println(str);
		
		
		System.out.println("convert String  into hashset only unique values");

		
		String name="akshay";
		HashSet<Character> ch=new HashSet<>();
		for(char c:name.toCharArray())
					ch.add(c);
		System.out.println(ch);

		
	}

}
