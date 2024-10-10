package entity;

import java.time.LocalDate;

//1.Customer should be assigned system generated (auto increment) 
//customer id : int
//Store - first name, last name email(string),password(string),
//registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
//Unique ID - email (2 customers CAN NOT have SAME email id)
public class Customer {
     public static int counter=0;
     public int id;
     public String firstname;
     public String lastName;
     public double registrationAmount;
     public LocalDate dob;
     public ServicePlan plan;
     public String email;
     public String password;
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Customer.counter = counter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getRegistrationAmount() {
		return registrationAmount;
	}
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public ServicePlan getPlan() {
		return plan;
	}
	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", registrationAmount="
				+ registrationAmount + ", dob=" + dob + ", plan=" + plan + ", email=" + email + "]";
	}
	public Customer(int id, String firstname, String lastName, double registrationAmount, LocalDate dob,
			ServicePlan plan, String email, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.email = email;
		this.password = password;
		counter++;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
     
     
}
