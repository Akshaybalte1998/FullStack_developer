package Recursion;

public class Power {
	
	public static void power(int b,int e,int total)
	{
		if(e==0)
		{
			System.out.println(total);
			return ;
		}
		power(b,e-1,total*5);
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base=5;
		int expo=2;
		power(base,expo,1);
	}

}
