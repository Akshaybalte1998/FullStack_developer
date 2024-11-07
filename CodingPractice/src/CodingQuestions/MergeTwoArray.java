package CodingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1 = {1, 3, 5,5};
		int[] arr2 = {2, 4, 6};
		ArrayList<Integer> list=new ArrayList<>();
		int len=arr1.length;
		for(int i:arr1)
		
		{
			list.add(i);
		}
		for(int i:arr2)
			
		{
			list.add(i);
		}
		Collections.sort(list);
		for(int i:list)
			
		{
			System.out.print(i+" ");
		}
	}

}
