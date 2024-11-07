package com.array;

import java.util.Scanner;


public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayStack as = new ArrayStack(5);
        as.push(10);
        as.push(20);
        as.push(30);
        as.push(40);
        as.push(50);

        System.out.println("Initial stack:");
        as.peek(); // Output: Printing top to bottom: 50 40 30 20 10

        as.pop(); // Output: Removed element is: 50
        as.pop(); // Output: Removed element is: 40

        System.out.println("Stack after popping:");
        as.peek(); // Output: Printing top to bottom: 30 20 10

        as.push(60);
        as.push(70);

        System.out.println("Stack after pushing:");
        as.peek(); // Output: Printing top to bottom: 70 60 30 20 10

        as.pop(); // Output: Removed element is: 70
        as.pop(); // Output: Removed element is: 60
        as.pop(); // Output: Removed element is: 30
        as.pop(); // Output: Removed element is: 20
        as.pop(); // Output: Removed element is: 10

        as.pop(); // Output: Stack is empty. Cannot pop.

        System.out.println("Final stack:");
        as.peek(); // Output: Stack is empty
		
		
		
		
		
		
	}

}
