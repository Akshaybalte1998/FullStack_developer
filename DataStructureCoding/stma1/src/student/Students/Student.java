package student.Students;

import java.time.LocalDate;

public class Student {
	
	
	private int id;
	private String name;
	private String phonenumber;
	private double percentage;
	private ResultType result;
	private LocalDate retest;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String phonenumber, double percentage, ResultType result, LocalDate retest) {
		super();
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.percentage = percentage;
		this.result = result;
		this.retest = retest;
	}
	public Student(int id2, String name2, String phonenumber2) {
		super();
		this.id = id2;
		this.name = name2;
		this.phonenumber = phonenumber2;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", percentage=" + percentage
				+ ", result=" + result + ", retest=" + retest + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public ResultType getResult() {
		return result;
	}
	public void setResult(ResultType result) {
		this.result = result;
	}
	public LocalDate getRetest() {
		return retest;
	}
	public void setRetest(LocalDate retest) {
		this.retest = retest;
	}
	
	

}
