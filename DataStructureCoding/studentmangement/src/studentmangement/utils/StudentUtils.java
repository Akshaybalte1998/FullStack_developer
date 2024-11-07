package studentmangement.utils;

import java.time.LocalDate;
import java.util.ArrayList;

import studentmangement.core.ResultType;
import studentmangement.core.Student;

public class StudentUtils {

	public static void addStudent(int id, String name, String phone, double per, String rs, String rd,
			ArrayList<Student> studentlist) {
		ResultType res=ResultType.valueOf(rs.toUpperCase());
		LocalDate d1=LocalDate.parse(rd);
		Student s=new Student(id,name,phone,per,res,d1);
		studentlist.add(s);
	}

	
}
