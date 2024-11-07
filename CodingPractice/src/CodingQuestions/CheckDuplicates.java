package CodingQuestions;

import java.util.HashSet;

public class CheckDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1, 3, 5,5};

		HashSet<Integer> set=new HashSet<>();
		
		for(int num:arr)
		{
			if(set.contains(num))
			{
				System.out.println( "contains duplicates elements");
				break;

			}
			set.add(num);
		}
	}

}
