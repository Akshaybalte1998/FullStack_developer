package student.Utlis;

import java.util.ArrayList;

import student.Students.Student;
import student.exception.StudentException;

public class StudentsValidate {

	public static void valROle(String role)throws StudentException {
		// TODO Auto-generated method stub
		if(role==null)
		{
			throw new StudentException("you not enter the role please enter the role adimn");
		}
		if(role.equals("student")) {
			throw new StudentException("you  enter the role as students please enter the role admin");

		}
		
	}

	public static void valId(int id, ArrayList<Student> students) throws StudentException {
		// TODO Auto-generated method stub
		for(Student s:students)
		{
			if(s.getId()==id)
			{
				throw new StudentException(" duplicate id found");

				
			}
		}
	}

	public static void validphone(String sphonenumber) throws StudentException {
		// TODO Auto-generated method stub
		String regexp="^[0-9]{10}$";
		if(sphonenumber==null|| !sphonenumber.matches(regexp)) {
			throw new StudentException(" please enter a correct phone number");

		}
		
	}

}
