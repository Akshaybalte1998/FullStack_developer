package com.abstractclassdemo;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] sarr=new Shape[3];  //array of references
		Scanner in= new Scanner(System.in);
		while(true)
		{
			System.out.println("MAIN MENU---------------");
			System.out.println("1. Create and accept shape objects");
			System.out.println("2. Display Area for all shapes");
			System.out.println("Enter the choice");
			int choice=in.nextInt();
			switch (choice) {
			case 1: 
				//utitlit class method
				ShaeArrayUtility.acceptShapeObjects(sarr);
				break;
			case 2:
				//utitlit class method
				ShaeArrayUtility.displayAreaofAll(sarr);
				break;
			default:
				return;
			}

		}

	}

}
