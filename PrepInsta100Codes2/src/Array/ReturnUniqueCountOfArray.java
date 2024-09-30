package Array;

import java.util.Scanner;

public class ReturnUniqueCountOfArray {

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
        int len=array.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(array[i]==array[j])
                {
                	array[i]=-1;
                }
            }
        }
        int temp=0;
        for(int i=0;i<len;i++)
        {
            if(array[i]==-1)
            {
                continue;
            }
            else{
              temp++;
            }
        }
        int[] arr=new int[temp];
        int count=0;
        for(int i=0;i<len;i++)
        {
        	if(array[i]!=-1)
        	{
        		arr[count++]=array[i];
        	}
        }

        
        
        
        System.out.println("array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		
		
         System.out.println(temp);
	}
	

}
