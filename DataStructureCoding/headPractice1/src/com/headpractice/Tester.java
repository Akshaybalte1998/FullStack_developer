package com.headpractice;

public class Tester {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Node head = new Node(110);  // Initialize head with a dummy value

		 Node first=new Node(10);
		 head.setNext(first);
		 Node second=new Node(20);
		 first.setNext(second);
		 Node third=new Node(30);
		 second.setNext(third);
		 Node forth=new Node(40);

		 Node fiv=new Node(50);
		 third.setNext(fiv);
		 fiv.setNext(forth);
		 while(head!=null)
		 {
			 System.out.println(head.getData()+"->");
		     head= head.getNext();
		 }
		
		
	}

}
