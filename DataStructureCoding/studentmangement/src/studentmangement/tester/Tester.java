package studentmangement.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import studentmangement.core.Student;
import studentmangement.utils.StudentUtils;

public class Tester {

	public static void main(String[] args) 
	{
		System.out.println("welcome to student management system");
		int choice;
		ArrayList<Student> studentlist=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in))
		{
			do {
			System.out.println("\n------------------------------------------------");
			System.out.println(
					"1.login\r\n"
					+ "2.add student //only admin\r\n"
					+ "3.update result //only admin add student\r\n"
					+ "4.view student\r\n"
					+ "5.scedule retest //only admin schedule retest\r\n"
					+ "6.view result \r\n" 
					+ "7.sort student based roll no\r\n"
					+ "8.sort  student based on name\r\n"
					+ "9.sort  student based on date\r\n" 
					+ "10.exit //data save in file serilizable");
			System.out.println("------------------------------------------------");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("login");
				break;
			case 2:
				System.out.println("add student");
				//int id, String name, String phonenumber, double percentage, studentmangement.core.ResultType result,
				//LocalDate retest
				System.out.println("enter id name phonenumber,per,resul,retest");
				StudentUtils.addStudent(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),studentlist);
				break;
			case 3:
				System.out.println(studentlist);
				
			default:
				System.out.println("wrong choice");
			}
			}while(choice!=10);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
