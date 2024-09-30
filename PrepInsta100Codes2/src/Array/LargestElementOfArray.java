package Array;

import java.util.Scanner;

public class LargestElementOfArray {

	
	private static void  max(int[] array, int n, int largeNumber) {
		if(n<0)
		{
			System.out.println("largest element is : "+largeNumber);
			 return ;
			
		}
		
		if(largeNumber<array[n])
		{
			largeNumber=array[n];
		}
		
		max(array,n-1,largeNumber);
		

		
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int size=scan.nextInt();
		int[] array=new int[size];
	    System.out.println("enter the  "+size+" elemets: ");
	    
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println("enter the "+i+" element :");
	    	array[i]=scan.nextInt();
	    }
	    
	    System.out.println("array is : ");
	    for(int i=0;i<array.length;i++)
	    {
	    	System.out.print(array[i]+" ");
	    }
		System.out.println("");
		
		// using simple iteration 
//		int largestNumber=array[0];
//		for(int i=0;i<array.length;i++)
//		{
//			if(largestNumber<array[i])
//				largestNumber=array[i];
//		}
//
//		System.out.println("largest element is : "+largestNumber);
		
		//using recursion
		int n=array.length-1;
		int largeNumber=array[0];
		max(array,n,largeNumber);
		
	}

	

}
