package Recursion;

public class Sum {

	public static int totalSum(int n)
	{	int sum=0;
		if(n==0)
		{
			return  0;
		}
	
			
		 return n+totalSum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		int sum =totalSum(n);
		System.out.println(sum);
	}

}
