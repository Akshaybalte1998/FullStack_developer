package Recursion;

public class PrintNumberDesc {

	public  void printDesc(int n)
	{
		if(n==0)
			return ;
		System.out.println(n);
		printDesc(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumberDesc obj=new PrintNumberDesc();
		obj.printDesc(10);
	}

}
