package student.Utlis;

import java.time.LocalDate;
import java.util.ArrayList;

import student.Students.ResultType;
import student.Students.Student;
import student.exception.StudentException;

public class StudentsUtlis {

	public static String login(String uname, String pass) throws StudentException {
		// TODO Auto-generated method stub
		if(uname.equals("admin")&&pass.equals("admin123"))
		{
			return "Admin";
		}
		if(uname.equals("student")&&pass.equals("student123"))
		{
			return "Student";
		}
		throw new StudentException("enter valid id and pass");
		
	}

	

	public static ArrayList<Student> populatedList() {
		// TODO Auto-generated method stub
		ArrayList<Student> students=new ArrayList<Student>();
		
		
		 students.add(new Student(1,"pankaj","9373809473",67.9,ResultType.PASS,LocalDate.parse("2024-07-07")));
		 students.add(new Student(1, "pankaj", "9373809473", 67.9, ResultType.PASS, LocalDate.parse("2024-07-07")));
		 students.add(new Student(2, "rahul", "9988776655", 78.5, ResultType.PASS, LocalDate.parse("2023-12-15")));
		 students.add(new Student(3, "sneha", "9123456789", 25.0, ResultType.FAIL, LocalDate.parse("2024-01-20")));
		 students.add(new Student(4, "mohit", "9876543210", 82.3, ResultType.PASS, LocalDate.parse("2024-03-10")));
		 students.add(new Student(5, "anita", "9988771122", 60.7, ResultType.PASS, LocalDate.parse("2024-06-05")));
		 students.add(new Student(6, "vijay", "9933445566", 39.2, ResultType.FAIL, LocalDate.parse("2023-11-30")));
		 students.add(new Student(7, "suman", "9876543210", 74.8, ResultType.PASS, LocalDate.parse("2024-02-25")));
		 students.add(new Student(8, "rohit", "9911223344", 88.9, ResultType.PASS, LocalDate.parse("2024-04-18")));
		 students.add(new Student(9, "kiran", "9898989898", 66.3, ResultType.PASS, LocalDate.parse("2023-10-10")));
		 students.add(new Student(10, "meena", "9765432109", 58.4, ResultType.PASS, LocalDate.parse("2024-05-15")));
			students.add(new Student( 11,"akshay","7447686701",90.60,ResultType.PASS,LocalDate.parse("2024-12-15")));

		return students;
	}



	public static String addStudnets(int id, String name, String phonenumber, ArrayList<Student> students, String role) throws StudentException{
		
		
		Student stud=new Student(id,name,phonenumber);
		students.add(stud);
		// TODO Auto-generated method stub
		return "added succefully";
	}



	public static String updateResult(int sid, double sper, ArrayList<Student> studentU, String role)throws StudentException {
		// TODO Auto-generated method stub
		Student std=null;
		for(Student s:studentU)
		{
			if(s.getId()==sid) {
				std=s;
				break;
			}
		}
		if(std==null)
		{
			throw new StudentException("enter a valid id");
		}
		std.setPercentage(sper);
		if(sper>35) {
			std.setResult(ResultType.PASS);
		}
		else
		{
			std.setResult(ResultType.FAIL);
		}
		
		
		
		
		
		return "upadte succefully";
	}



	public static void displayStudnets(ArrayList<Student> student)throws StudentException  {
		// TODO Auto-generated method stub
		System.out.println("students details");
		for(Student s:student) {
			System.out.println(s);
		}
	}

}
