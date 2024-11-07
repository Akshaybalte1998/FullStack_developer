package com.app;

import java.util.Scanner;

public class CrudOpertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[20];
		int  count=0;
		int newelement;
		int choice ;
		do
		{
			
			System.out.println("1  add array elemnt\r\n"
					+ "2.display array element\r\n"
					+ "3.add array elemnt at first\r\n"
					+ "4.add array element at end\r\n"
					+ "5.add array element at specific position\r\n"
					
					+ "6.remove array elemnt at first\r\n"
					+ "7.remove array element at end\r\n"
					+ "8.remove array element at specific position\r\n"
					+ "9.update new value using index\r\n"
					+ "10.update new value using value\r\n"
					+ "11.Display All element\r\n"
					+ "12. Display  index of element using value \r\n"
					+ "13. Display  value of element using index\r\n"
                  +"15.exit"
					);
			System.out.println("--------------------------");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			System.out.println("");
			
			
			switch(choice)
			{
			case 1:
				count=Opertion.addElement(arr,count);
				
				break;
			case 2:
				Opertion.displayElement(arr,count);
				
				break;
			case 3:
				count=Opertion.addElementAtFirst(arr,count);
				
				break;
			case 4:
				count=Opertion.addElementAtlast(arr,count);
				
				break;
			case 5:
				count=Opertion.addElementAtSpecificPostion(arr,count);
				
				break;
			case 6:
				count=Opertion.removeElementAtFirst(arr,count);
				
				
				break;
			case 7:
				count=Opertion.removeElementAtlast(arr,count);
				
				break;
			case 8:
				
				count=Opertion.removeElementAtSpecificPostion(arr,count);
				break;
			case 9:
				Opertion.updateUsingIndex(arr,count);
				break;
			case 10:
				Opertion.updateUsingValue(arr,count);
				break;
			case 11:
				Opertion.displayElement(arr,count);
				break;
			case 12:
				Opertion.displayValueUsingIndex(arr,count);
				break;
			case 13:
				//Opertion.displayIndexUsingValue(arr,count);
				break;
				
				
			case 15:
				System.out.println("exit");
				break;
			default:
				System.out.println("yopu enter a wrong choice");
				break;
				
			}
			
		}while(choice!=15);
	}

}
