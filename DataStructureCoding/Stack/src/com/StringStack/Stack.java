package com.StringStack;

public class Stack {

	String[] name;
	int top;
	int size;
	
	public Stack(int size)
	{
		this.size=size;
		top=-1;
		name=new String[size];
	}
	
	public int getSize()
	{
		return (top+1);
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	
	public void push(String data)
	{
		if(isFull())
		{
			System.out.println("stack is full");
			return ;
		}
		name[++top]=data;
		
	}
	public String pop()
	{
	
		if(isEmpty())
		{
			System.out.println("stack is empty ");
			return "empty";
		}
		
		return name[top--];
	}
	
	public String peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty ");
			return "empty";
		}
		
		return name[top];
	}
	
	
	
	
	
}
