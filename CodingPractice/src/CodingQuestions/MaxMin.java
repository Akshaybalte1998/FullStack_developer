package CodingQuestions;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1, 3, 5,5};

		int max=arr[0];
		int min=arr[1];
		int len=arr.length;
//		for(int num:arr)
//		{
//			if(max<num)
//				max=num;
//			if(min>num)
//				min=num;
//		}
//		System.out.println("max "+max);
//		System.out.println("min "+min);
		
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		//Arrays.sort(arr);
		System.out.println("max "+arr[arr.length-1]);
		System.out.println("min "+arr[0]);
	}

}
