package Array;

import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 2, 2, 3, 4, 4, 5};
	        HashSet<Integer> set = new HashSet<>();
	        
	        // Adding elements to the HashSet
	        for (int num : array) {
	            set.add(num);
	        }
	         for(int num:set)
	        	 System.out.println(num);
	}

}
