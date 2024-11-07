package CodingQuestions;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,3,66,1,5,-5,7,-8,-1};
		Arrays.sort(arr);
		for(int i:arr)
			System.out.println(i);
		System.out.println("Smallest element : "+arr[0]);
		System.out.println("Largest Element : "+arr[arr.length-1]);
		
		
	}

}
