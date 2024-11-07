package com.linkedlist;

 



public class LinkedlList {
	

	Node head;

	public Node getHead() {
		return head;
	}

	public LinkedlList()
	{
		head=null;
	}
	
	public void insert(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
		}
		
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		
	}
	
	
}
