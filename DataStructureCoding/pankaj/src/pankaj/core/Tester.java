package pankaj.core;

public class Tester {

	public static void main(String[] args) {
		Node head=null;
		Node first=new Node(12);
		if(head==null)
		{
			head=first;
		}
		Node second=new Node(134);
		head.setNext(second);
		Node third=new Node(45);
		second.setNext(third);
		
		
		while(head!=null)
		{
			System.out.print(head.getData()+"->");
			//Shead=head.getNext();
		}
	}

}
