package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AdditionOfElemetInArrayWithGreatest extends ArrayPrintInput {

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
		
		
		
		int sum=0,nal=0;
		int[] newArray =new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			sum=0;
			int number=array[i];
			while(number>0)
			{
				int temp=number%10;
				sum+=temp;
				number/=10;
			}
			newArray[nal++]=sum;
		}
		System.out.println("array is : ");
		for(int i=0;i<newArray.length;i++)
		{
			System.out.print(newArray[i]+" ");
		}
		System.out.println(" ");
		Arrays.sort(newArray);
		
		System.out.println("array is : ");
		for(int i=0;i<newArray.length;i++)
		{
			System.out.print(newArray[i]+" ");
		}
		System.out.println(" ");
		System.out.println(" largest element is ");
		
		System.out.println(newArray[newArray.length -1]);
	}

}
