package com.Collection;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stack<Integer> stack = new Stack<>();

	        // Push elements onto the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.add(1,50);

	        // Pop elements from the stack
	        int poppedElement = stack.pop();
	        System.out.println("Popped element: " + poppedElement);

	        // Peek at the top element
	        int topElement = stack.peek();
	        System.out.println("Top element: " + topElement);

	        // Iterate through the stack
	       System.out.println(stack);
	}

}
