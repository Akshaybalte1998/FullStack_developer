package Array;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfArrayElemet {

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
		
		
		System.out.println("array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");
		
		
		
		
		

		int length=array.length;
		System.out.println("frequencies count: ");
		for(int i=0;i<length;i++)
		{
			if(array[i]==-1)
			{
				continue;
			}
			int count=1;
			for(int j=i+1;j<length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					array[j]=-1;
				}
			}
			System.out.println(array[i]+" : "+count);
			 
		}
		System.out.println("array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");

		
		
	}
	

}
