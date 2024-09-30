package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberUsingInbuiltmethos {
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
		
		// using array inbuilt method
		Arrays.sort(array);
		 System.out.println("array is : ");
		    for(int i=0;i<array.length;i++)
		    {
		    	System.out.print(array[i]+" ");
		    }
			System.out.println("");
			
		System.out.println(" largest element is : "+array[array.length-1]);
}
}