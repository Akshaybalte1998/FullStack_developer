package com.inputArray;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringArray[]= {"akshya","balte","ashu","anavi ","shiva","bapu ","aai"};
    	for(String s:stringArray)
		  System.out.println(s);
		
		System.out.println(Arrays.toString(stringArray));
		System.out.println(Arrays.asList(stringArray));
		System.out.println(Arrays.deepToString(stringArray));//2d array
		
		
		//length of arrays
		System.out.println("length of string arrays  : " +stringArray.length);


	}

}
