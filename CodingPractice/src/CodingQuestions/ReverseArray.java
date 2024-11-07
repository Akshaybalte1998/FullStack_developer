package CodingQuestions;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {1, 3, 5,5};
		int len =arr.length;
		
		int start=0;
		int end=len-1;
		while(start<end)
		{
//			int temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
			arr[start]=arr[start]+arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]=arr[start]-arr[end];
			
			start++;
			end--;
		}
		for(int num:arr)
			System.out.print(num+" ");
	}

}
