package com.abstractclassdemo;

import java.util.Scanner;

public class ShaeArrayUtility {
	
	public static void acceptShapeObjects(Shape[] sarr)
	{
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println("SUB MENU--------");
			System.out.println("1. CIRCLE");
			System.out.println("2. SQUARE");
			System.out.println("Enter the shape:");
			int choice=in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the radius:");
				double radius=in.nextDouble();
				sarr[i]=new Circle(radius);
				break;
			case 2:
				System.out.println("Enter the side:");
				double side=in.nextDouble();
				sarr[i]=new Square(side);
				break;
			default:
				break;
			}
		}
	}

	
	public static void displayAreaofAll(Shape [] sarr)
	{
		for(int i=0;i<sarr.length;i++)
		{
			sarr[i].calArea();
			System.out.println(sarr[i].toString());
		}
	}
}
