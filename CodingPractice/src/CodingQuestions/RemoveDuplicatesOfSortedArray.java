package CodingQuestions;

import java.util.TreeSet;

public class RemoveDuplicatesOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,1,1,2,2,2,3,3,4,5,5,6,6};
		
	
		TreeSet<Integer> set=new TreeSet<>();
		for(int temp: arr)
			set.add(temp);
		for(int temp:set)
			System.out.println(temp);
		System.out.println(set.size());
	}

}
