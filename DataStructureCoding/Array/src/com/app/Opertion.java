package com.app;

import java.util.Scanner;

public class Opertion {
	static Scanner sc=new Scanner(System.in);
	public static int addElement(int[] arr, int count) {

		System.out.println("enter the size of array");
		int size =sc.nextInt();
		for(int i=0;i<size;i++) {
			
			if(count<arr.length) {
				System.out.println("enter the "+i+"  element");	
				arr[count++]=sc.nextInt();
			}else
			{
				System.out.println("array is full");
				break;
			}
		
		}
		System.out.println("");
		return count;
	}
	
	
	
	public static int displayElement(int[] arr ,int count) {
		System.out.println("------------display element------");
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
		return 0;
	}
	
	
	
	public static int addElementAtFirst(int[] arr, int count) {
		if(count>=arr.length)
		{
			System.out.println("array is full");
			return count;
		}
		
		for(int i=count;i>0;i--)
		{
			arr[i]=arr[i - 1];
		}
		System.out.println("enter the new element to add at first");
		int newElement=sc.nextInt();
		arr[0]=newElement;
		count++;
		return count;
	}
	
	
	
	
	public static int addElementAtlast(int[] arr, int count) {
		if(count>=arr.length)
		{
			System.out.println("array is full");
			return count;
		}
		
		System.out.println("enter the new element to add at first");
		int newElement=sc.nextInt();
		arr[count]=newElement;
		count++;
		
		return count;
	}
	
	
	
	
	
	
	
	
	public static int addElementAtSpecificPostion(int[] arr, int count) {
		if(count>=arr.length)
		{
			System.out.println("array is full");
			return count;
		}
		
		System.out.println("enter the position");
		int position=sc.nextInt();
		System.out.println("enter the array elemant");
		int newElement=sc.nextInt();
		
		
		 if (position > count || position < 0) {
	            System.out.println("Invalid position.");
	         
		}else {
			for(int i=count;i>position;i--) {
				arr[i]=arr[i-1];
			}
			arr[position]=newElement;
			count++;
		}
		
		
		
		
		
		return count;
	}
	
	
	
	
	public static int removeElementAtFirst(int[] arr, int count) {
		
		if (count == 0) {
            System.out.println("Array is empty.");
            return count;
        }
		for(int i=0;i<count-1;i++)
		{
			arr[i]=arr[i +1];
		}
		
		count--;
		
		
		return count;
	}



	public static int removeElementAtlast(int[] arr, int count) {
		if (count == 0) {
            System.out.println("Array is empty.");
            return count;
        }
		count --;
		return count;
	}



	public static int removeElementAtSpecificPostion(int[] arr, int count) {
		if(count==0) {
			System.out.println("array is emptty");
			return count;
		}
		System.out.println("enter the position");
		int position=sc.nextInt();
		if(position>count|| position<0)
		{
			System.out.println("invalid position");
			return count;
		}
		else
		{
			for(int i=position;i<count-1;i++)
			{
				arr[i]=arr[i+1];
			}
			count--;
		}
		
		
		
		return count;
	}



	public static void updateUsingIndex(int[] arr, int count) {
		System.out.println("enter the position");
		int position=sc.nextInt();
		 if (position >= count || position < 0) {
	            System.out.println("Invalid position.");
	        } 
		else
	        {
	        	System.out.println("enter the value");
	        	int value=sc.nextInt();
	        	arr[position]=value;
	        }
	}



	public static void updateUsingValue(int[] arr, int count) {
		
		System.out.println("enter the value for checking the value presemnt in array or not");
		int value=sc.nextInt();
		boolean found=false;
		 for(int i=0;i<count-1;i++)
		 {
			 if(value==arr[i])
			 {
				 System.out.println("enter the value for update");
					int newvalue=sc.nextInt();
				 arr[i]=newvalue;
				 found=true;
				 break;
			 }
			 
		 }
		 if (!found) {
		        System.out.println("Value not found in the array.");
		    }
	}



	public static void displayValueUsingIndex(int[] arr, int count) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the index to find value:");
		    int index = sc.nextInt();
		    
		    if (index >= 0 && index < count) {
		        System.out.println("The given index is " + index);
		        System.out.println("The value at the given index is: " + arr[index]);
		    } else {
		        System.out.println("Index is out of bounds.");
		    }
		
	}


	public static void displayIndexUsingValue(int[] arr, int count) {
		System.out.println("Enter the value  to find index :");
	    int value = sc.nextInt();
	    for(int i=0;i<count;i++)
		{
	    	 if (value==arr[i]) {
	 	        System.out.println("The given value is " + value);
	 	        System.out.println("The Index at the given value is: " + i);
	 	    } else {
	 	        System.out.println(" Value id not foun.");
	 	    }

		}
	   		
	}
}
