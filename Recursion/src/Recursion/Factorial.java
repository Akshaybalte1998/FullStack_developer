package Recursion;

public class Factorial {
	public static void fact(int n,int total)
	{
		if(n==1)

		{
			System.out.println(total);
			return ;
		}
		fact(n-1,total*n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fact(5,1);
	}

}
