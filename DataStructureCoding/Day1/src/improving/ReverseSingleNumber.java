package improving;

import java.util.Scanner;

public class ReverseSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		System.out.println("number before reverse ");
		System.out.println(" Number : "+number);
		
		//reverse the number
		int reverse=0;
		while(number>0)
		{
			int reaminder=number%10;
			reverse=(reverse*10)+reaminder;
			number=number/10;
			
		}
		System.out.println("number after reverse ");
		System.out.println(" Number : "+reverse);
		
	}

}











 