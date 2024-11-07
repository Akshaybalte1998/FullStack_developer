package com.array;

public class ArrayStack {

	 private int[] stack;
	    private int top;
	    private int size;

	    public ArrayStack(int size) {
	        this.size = size;
	        top = -1;
	        stack = new int[size];
	    }

		public void push(int item) {
			// TODO Auto-generated method stub
			if(iFull())
			{
				System.out.println("stack is full");
				return;
			}
			stack[++top]=item;
		}

		private boolean iFull() {
			// TODO Auto-generated method stub
			return (top==size-1);
		}

		public void pop() {
			// TODO Auto-generated method stub
			if(isEmpty())
			{
				System.out.println("stack is empty");
				return;
			}
		int deleteditem=stack[top--];
		System.out.println(" deleted item is :"+deleteditem);
		}

		private boolean isEmpty() {
			// TODO Auto-generated method stub
			return (top==-1);
		}

		

		public void peek() {
			// TODO Auto-generated method stub
			  if (isEmpty()) {
		            System.out.println("Stack is empty");
		            return;
		        }
			for(int i=top;i>=0;i--)
			{
				System.out.println(stack[i]);
			}
		}
	    
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	   /* 
	    

	    

	   
	    */
	}
	

