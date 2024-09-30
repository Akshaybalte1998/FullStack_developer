package Array;

import java.util.Scanner;

public class RverseArray {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("enter the "+i+" element ");
			array[i]=sc.nextInt();
		}
		System.out.println("array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println(" ");
		
		System.out.println("reverse array using simple printing  : ");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println(" ");
		
		System.out.println("making new array for reverse: ");
		int[] reverseArray=new int[array.length];
		int reverserLength=0;
		for(int i=array.length-1;i>=0;i--)
		{
			reverseArray[reverserLength++]=array[i];
		}
		
		
		System.out.println("reverser array is : ");
		for(int i=0;i<reverseArray.length;i++)
		{
			System.out.print(reverseArray[i]+" ");
		}
		
		System.out.println(" ");
		
		
		System.out.println("\n\n\n ");
		System.out.println("make given array in reverse order : ");
		int start=0;
		int end=array.length-1;
		while(start<end)
		{
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("array reverse inside in it  : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println(" ");
	}

}
