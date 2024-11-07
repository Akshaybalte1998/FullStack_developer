package LL;

import java.util.Scanner;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll=new LinkedList();

		
		
		
		
		
		
		
		
		
	/*	ll.addFirst(10);
		ll.addFirst(20);

		ll.addFirst(30);

		ll.addFirst(40);

		
		
		ll.addLast(80);
		ll.addLast(90);

		ll.addLast(100);
		ll.addLast(110);

		
		
		ll.display();  //40 30 20 10 80 90 100 110 
		
		*/
		
		
		Scanner sc=new Scanner(System.in);

		int choice ;
		do
		{
			
			System.out.println(
					 "1.add  elemnt at first\r\n"
					+ "2.add array element at end\r\n"
					+ "3.add array element at specific position\r\n"
					
					+ "4.delete  elemnt at first\r\n"
					+ "5.delete  element at end\r\n"
					+ "6.delete  element at specific position\r\n"
					+ "7.delete  element using value\r\n"
					+ "8.delete  element using index\r\n"
					+ "9.update new value using index\r\n"
					+ "10.update new value using value\r\n"
					+ "11.Display All element\r\n"
					+ "12. Display  index of element using value \r\n"
					+ "13. Display  value of element using index\r\n"
					+ "14. Display  reverse using recusriion\r\n"
					+ "15. Display  reverse using stack\r\n"
					+ "17. Reverse the linked list\r\n"
					+ "20.get size of array \r\n"
                  +"21.exit"
					);
			System.out.println("--------------------------");
			System.out.println("enter the choice");
			choice=sc.nextInt();
			System.out.println("");
			
			
			switch(choice)
			{
			case 1:
//				System.out.println("enter the element");
//				int data=sc.nextInt();
//				ll.addFirst(data);
				ll.addFirst(10);
				ll.addFirst(20);	ll.addFirst(30);	ll.addFirst(40);
				break;
			case 2:
//				System.out.println("enter the element");
//				int data1=sc.nextInt();
//				ll.addLast(data1);
				ll.addLast(80);
				ll.addLast(90);
				ll.addLast(100);
				ll.addLast(110);
				break;
			case 3:
//				System.out.println("enter the position");
//				int position=sc.nextInt();
//
//				System.out.println("enter the element");
//				int data3=sc.nextInt();
//
//				ll.specificPosition(data3,position);
				ll.specificPosition(155,3);
				break;
			case 4:
				 ll.deleteFrist();
				break;
			case 5:
				ll.deleteLast();
				break;
			case 6:
//				System.out.println("enter the position");
//				int position2=sc.nextInt();
				//ll.deleteAtSpecificPosition(position2);
				ll.deleteAtSpecificPosition(5);
				
				break;
			case 7:
//				System.out.println("enter the value");
//				int value=sc.nextInt();
				//ll.deleteUsingValue(value);
				ll.deleteUsingValue(90);

				break;
			case 8:
//				System.out.println("enter the position");
//				int position3=sc.nextInt();
				//ll.deleteUsingIndex(position3);
				ll.deleteUsingIndex(3);

				break;
			case 9:
				ll.updateValueUsingIndex(5,1234);
				break;
			case 10:
				ll.updateValueUsingValue(90,54321);
				break;
			case 11:
				ll.display();
				break;
			case 12:
				System.out.println("Display  index of element using value");
				ll.displayIndexUsingValue(20);
				break;
			case 13:
				System.out.println("Display  value of element using index");
				ll.displayValueUsingIndex(3);
				break;
			case 14:
				System.out.println("exit");
				break;
			case 15:
				System.out.println("exit");
				break;
			case 16:
				System.out.println("exit");
				break;
			case 17:
				System.out.println("Reverse the Linked List");
				ll.reverseList();
				break;
			case 20:
				System.out.println(ll.getSize());
				break;
				
				
			case 21:
				System.out.println("exit");
				break;
			default:
				System.out.println("yopu enter a wrong choice");
				break;
				
			}
			
		}while(choice!=15);
		
		
		
		
		
		
		
		
		
		
		
	}

}
