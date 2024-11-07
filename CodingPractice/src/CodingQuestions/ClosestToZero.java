package CodingQuestions;

public class ClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,66,1,5,-5,7,-8,-1};
		
		if(arr==null||arr.length==0)
			System.out.println("0");
		int closet=arr[0];
		for(int temp:arr)
		{
			if( Math.abs(temp) < Math.abs(closet) )
				closet=temp;
			else if( Math.abs(temp) == Math.abs(closet) &&temp>closet)
				closet=temp;
		}
		System.out.println(closet);
	}

}
