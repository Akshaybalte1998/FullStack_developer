package improving;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		
		int[] arr=new int[size];
		
		//taking input;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the "+i+" element of array:");
			arr[i]=scan.nextInt();
		}
		
		
		//printing the array
		System.out.print("Array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		// using simple coding
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("maximum number in given array is :"+max);
		System.out.println("minimun number in given array is :"+min);

		
		
	}

}
