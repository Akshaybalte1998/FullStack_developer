package com.areaPerimter;

import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
			
			boolean exit=false;
			int choice;
			while(!exit)
			{
				
				System.out.println("enter the choice :");
				System.out.println("1.Area of rectangle ");
				System.out.println("2. Area of circle ");
				System.out.println("3. Area of square");
				System.out.println("4. Area of triangle using base and height  ");
				System.out.println("5. Area of triangle using three side of triangle  ");

				System.out.println("6.exit ");
				System.out.println(" enter the choice:");
				choice=scan.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter the two side for finding area of reactangle: ");
					int length=scan.nextInt();
					int breadth=scan.nextInt();
					int areaOfRectangle=length*breadth;
					 String formattedNumber1 = String.format("%.2f", areaOfRectangle); 
					System.out.println("Area of recatnagle: " +formattedNumber1);
					break;
				case 2:
					System.out.println("enter the  radius of circle for finding area of circle : ");
					double radius=scan.nextDouble();
					double pi=3.14;
					double areaOfCricle=(pi*radius*radius);
					 String formattedNumber2 = String.format("%.2f", areaOfCricle); 

					System.out.println("Area of circle: " +formattedNumber2);
					break;
				case 3:
					System.out.println("enter the  side for finding area of square: ");
					int side=scan.nextInt();
					
					int areaOfSquare=side*side;

					System.out.println("Area of square: " +areaOfSquare);
					break;
				case 4:
					System.out.println("enter the  height and breadth of triangel for finding area of triangle : ");
					double height=scan.nextDouble();
					double base=scan.nextDouble();
					double areaOfTriangle=(0.5*height*base);
					 String formattedNumber4 = String.format("%.2f", areaOfTriangle); 

					System.out.println("Area of triangle: " +formattedNumber4);
					break;
				case 5:
					System.out.println("enter the  three side of triangle for finding area of triangle : ");
					double a=scan.nextDouble();
					double b=scan.nextDouble();
					double c=scan.nextDouble();
					double sp=(a+b+c)/2;
					
					double areaOfTriangle2=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
					 String formattedNumber5 = String.format("%.2f", areaOfTriangle2); 

					System.out.println("Area of triangle: " +formattedNumber5);
					break;
				case 6:
					exit=true;
					break;
				}
			}
	}

}
