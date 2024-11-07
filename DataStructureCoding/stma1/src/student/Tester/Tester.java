package student.Tester;

import java.util.ArrayList;
import java.util.Scanner;

import student.Students.Student;
import student.Utlis.StudentsUtlis;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to students management system");

		int ch ;
		String role =null;
		try(Scanner sc=new Scanner(System.in))
		{
			ArrayList<Student> student=StudentsUtlis.populatedList();
			
		System.out.println(student);
			do
			{
				
				System.out.println("1.login\r\n"
						+ "2.add student\r\n"
						+ "3.update result\r\n"
						+ "4.view result\r\n"
						+ "5.scedule retest\r\n"
						+ "6.view exam toper\r\n"
						+ "7.sort student based roll no\r\n"
						+ "8.sort  student based on name\r\n"
						+ "9.exit");
				System.out.println("-------------------------------");
				System.out.println("enter the choice");
				ch=sc.nextInt();
				try
				{

					switch(ch)
					{
					case 1:
						System.out.println("login ");
						System.out.println("enter the user name and password");
						role=StudentsUtlis.login(sc.next(),sc.next());
						System.out.println("role--------"+role);
						System.out.println("-----------login succefully------------");
						break;
					case 2:
						System.out.println("Adding new students");
						System.out.println(" enter the studenst id ,name ,phonenumber and role");
					      System.out.println(  StudentsUtlis.addStudnets(sc.nextInt(),sc.next(),sc.next(),student,sc.next()));
					      System.out.println("----added succesfully-----");
						
						
						break;
					case 3:
						System.out.println("update new students");
						System.out.println(" enter the studenst id ,percentage and role");
					      System.out.println(  StudentsUtlis.updateResult(sc.nextInt(),sc.nextDouble(),student,sc.next()));
					      System.out.println("----update  succesfully-----");
						
						break;
					case 4:
						System.out.println("display students");
						StudentsUtlis.displayStudnets(student);
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						break;
					default:
						System.out.println("you enter wrong choce please enter new choice");
						break;
					}
					
				}catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		
				
			}while(ch!=9);
			
		
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
