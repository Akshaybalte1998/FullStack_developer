package Recursion;

public class SumWithoutReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int n=5;
		int total=sum(n,0);
		System.out.println(total);

	}

	private static int sum(int n, int i)
	{
		if(n==0)
			return i;
		
		return sum(n-1,i+n);
		

		
	}

//	private static void sum(int n,int total) {
//
//		if(n==0)
//		{
//			System.out.println(total);
//			return ;
//		}
//		sum(n-1,total+n);
//	}

}
