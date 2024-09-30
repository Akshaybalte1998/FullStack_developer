package Array;

import java.util.Scanner;

public class NumberInDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number to find how many digit number is  : ");
		int number=sc.nextInt();
		int digit=0;
		int temp=number;
		while(number>0)
		{
			int pickLast=number%10;
			digit++;
			number=number/10;
		}
		System.out.println(temp +" contain  "+digit+" numbers");
	}

}
