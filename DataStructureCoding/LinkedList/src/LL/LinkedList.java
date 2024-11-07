package LL;

public class LinkedList {

	private Node head;
	private int size;
	public LinkedList() {
		super();
		this.head = null;
		size=0;
	}

	public Node getHead() {
		return head;
	}
	public int getSize()
	{
		return size;
	}

	@SuppressWarnings("unused")
	public boolean addFirst(int data) {
		// TODO Auto-generated method stub
		Node newnode=new Node(data);
		if(newnode==null) 
		{
			return false;
		}
		
		size++;
		// 1 head is null
		if(head==null)
		{
			head=newnode;
			return true;
		}
		//  
		newnode.setNext(head);
		head=newnode;
		return true;
	}

	@SuppressWarnings("unused")
	public boolean addLast(int data) {

		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		size++;
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
		return true;
	}

	public void display() {
		if(head==null)
		{
			System.out.println("list is empty");
			return ;
		}
	
	      Node temp = head;

	        while(temp != null) {
	            System.out.print(temp.getData() + " ");
	            temp = temp.getNext();
	        }
	        System.out.println();
	    
		
		
	}

	@SuppressWarnings("unused")
	public boolean specificPosition(int data, int position) {

		if(position<=0 ||(head==null&&position>1))
		{
			return false;
		}
		size++;
		Node newNode=new Node(data);
		
		if(newNode == null) {
            return false;
        }
		if(position==1)
		{
			newNode.setNext(head);
			head=newNode;
			return true;
			 

		}
		
		Node prev=head;
		for(int i=1;i<position-1;i++)
		{
			prev=prev.getNext();
			 if(prev == null) {
	                return false;
	            }

		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	public void deleteFrist() {
		// TODO Auto-generated method stub
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		head=head.getNext();
		}

	public void deleteLast() {
 
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		if(head.getNext()==null)
		{
			head=null;
			return ;
		}
		Node secondLast=head;
		Node lastNode=head.getNext();
		while(lastNode.getNext()!=null)
		{
			secondLast=secondLast.getNext();
			lastNode=lastNode.getNext();
		}
		secondLast.setNext(null);
	}

	public void deleteAtSpecificPosition(int position) {
		// TODO Auto-generated method stub
		if(position<0)
		{
			System.out.println("invalid position");
			return;
		}
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		size--;
		if(position==0)
		{
			head=head.getNext();
		}
		
		Node temp=head;
		for(int i=1;i<position;i++)
		{
			
			temp=temp.getNext();
		}
		
		temp.setNext(temp.getNext().getNext());
	}

	public void deleteUsingValue(int value) {
		// TODO Auto-generated method stub
		
		if( head == null)
		{
			return ;
			
		}
		if(head.getData()==value)
		{
			head=head.getNext();
		}
		
		Node prev=head,del=head;
		while(del.getData()!=value)
		{
			prev=del;
			del=del.getNext();
			if(del.getNext()==null)
			{
				return ;
			}
		}
		prev.setNext(del.getNext());
	}

	@SuppressWarnings("unused")
	public void deleteUsingIndex(int index) {
		// TODO Auto-generated method stub
	
		if(head==null||index<=0)
		{
			return ;
		}
		
		if(index==1)
		{
			head=head.getNext();
		}
		Node trav=head;
		for(int i=1;i<index-1;i++)
		{
			trav=trav.getNext();
			if(trav.getNext()==null &&trav==null)
			{
				return ;
			}
		}
		trav.setNext(trav.getNext().getNext());
	}

	public void updateValueUsingIndex(int index, int updateValue) {
		// TODO Auto-generated method stub
		
		Node prev=head;
		for(int i=1;i<index;i++)
		{
			prev=prev.getNext();
		}
		prev.setData(updateValue);
	}

	public void updateValueUsingValue(int oldValue, int newValue) {
		// TODO Auto-generated method stub
		
		Node prev=head;
		while(prev.getData()!=oldValue)
		{
			prev=prev.getNext();
		}
		prev.setData(newValue);
	}

	public void displayIndexUsingValue(int value) {
		// TODO Auto-generated method stub
		Node prev=head;
		int index=1;
		while(prev.getNext()!=null)
		{
			if(prev.getData()==value)
			{
				System.out.println("the given value is :  "+value+"  and the index for given value is : "+index);
			}
			prev=prev.getNext();
			index++;
		}
	}

	public void displayValueUsingIndex(int index) {
		// TODO Auto-generated method stub
		
		Node prev=head;
		for(int i=1;i<index;i++)
		{
			prev=prev.getNext();
		}
		System.out.println("the given index is : "+index+"  and value of that index is : "+prev.getData());
	}

	public void reverseList() {

		Node prev=null;
		Node current=head;
		
		while(current.getNext()!=null)
		{
			Node forward=current.getNext();
			current.setNext(prev);
			prev=current;
			current=forward;
		}
		head=prev;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
