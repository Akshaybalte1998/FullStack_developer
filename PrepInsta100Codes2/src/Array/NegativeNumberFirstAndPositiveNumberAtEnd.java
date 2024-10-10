package Array;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumberFirstAndPositiveNumberAtEnd {

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
		
		//Arrays.sort(array);
		int len=array.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		
		System.out.println("negative number first and paositive number last array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println(" ");
	}

}
