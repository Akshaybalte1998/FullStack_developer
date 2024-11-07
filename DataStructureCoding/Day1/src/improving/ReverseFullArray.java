package improving;

import java.util.Scanner;

public class ReverseFullArray {

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
		
		//using second array
		int n=arr.length;
		int j=arr.length;
		int newArr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			newArr[i]=arr[n-1-i];
			
		}
		
		System.out.println("reverse arrays is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}

		
		
		//use while loop 
		System.out.println("using while loop");
		int temp;
		int start=0,end=arr.length-1;
		while(start<end)
		{
			temp=arr[start];
			arr[end]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("reverse arrays is :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
		
		
		

		
		
	}

}
