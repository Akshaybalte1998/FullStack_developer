package Recursion;

public class Fibonicee {
	public void fibonnaci(int a,int b,int n)
	{
		if(n==0)
			return ;
		int c=a+b;
		System.out.println(c);
		fibonnaci(b, c, n-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=1;
		System.out.println(a);
		System.out.println(b);
		Fibonicee fb=new Fibonicee();
		int n=10;
		fb.fibonnaci(a,b,n-2);
	}

}
