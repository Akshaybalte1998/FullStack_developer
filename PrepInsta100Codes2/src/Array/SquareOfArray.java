package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("enter the "+i+" element ");
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
		
		int[] tempArray=new int[array.length];
		int len=0;
		for(int i=0;i<array.length;i++)
		{
			int square=array[i]*array[i];
			tempArray[i]=square;
		}
		Arrays.sort(tempArray);
		System.out.println("array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(tempArray[i]+" ");
		}
		System.out.println(" ");
		
	}

}
