package TCSNQT;

import java.util.Scanner;

public class ChokaletQuestion {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the size of array : ");
//		int size=sc.nextInt();
//		int[] array=new int[size];
//		
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.println("enter the "+i+" element ");
//			array[i]=sc.nextInt();
//		}
//		System.out.println("array is : ");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
//		System.out.println(" ");
		//N=8 and arr = [4,5,0,1,9,0,5,0].
		//4 5 1 9 5 0 0 0
		
		
		
		int[] array= {4,5,0,1,9,0,5,0};
//		for(int i=0;i<array.length;i++)
//		{
//			if(array[i]==0)
//			{int m=i;
//				for(int j=i+1;j<array.length;j++)
//				{
//					
//					int temp=array[m];
//					array[m++]=array[j];
//					array[j]=temp;
//				}
//			}
//		}
//		System.out.println("array is : ");
		
		
		
		//descond way using another array
		int size=array.length;
		int[] temp=new int[size];
		int result=0;
		for(int i=0;i<size;i++)
		{
			if(array[i]!=0)
			temp[result++]=array[i];
		}
		
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println(" ");
	}

}
