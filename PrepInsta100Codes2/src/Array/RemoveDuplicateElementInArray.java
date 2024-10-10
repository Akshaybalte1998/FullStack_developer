package Array;

import java.util.Scanner;

public class RemoveDuplicateElementInArray {

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
		
		
		
		
		int l=array.length;
		int count=0;
		 int[] tempArray=new int[l];
		for(int i=0;i<l;i++)
		{
			if(array[i]==-1)
			{
				continue;
			}
			boolean duplicate=false;

			for(int j=i+1;j<l;j++)
			{
				if(array[i]==array[j])
				{
					array[i]=-1;
				}
			}
			if(!(duplicate))
				tempArray[count++]=array[i];

		}
		System.out.println("array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(tempArray[i]+" ");
		}
		System.out.println(" ");
	}

}
