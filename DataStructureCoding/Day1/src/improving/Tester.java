package improving;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tester 
{
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		String date="2024-04-04";
		String result="pass";
		Result r=Result.valueOf(result);
		
		
		//student s=new Student(date)
		
		LocalDate d1=LocalDate.parse(date);
		System.out.println(d1+" "+date);
		
		
		addelement(22,al);
		System.out.println(al);
	}

	private static void addelement(int num,ArrayList<Integer> al) {
		al.add(num);
		
	}

}
