package com.Collection;

import java.util.ArrayDeque;
import java.util.Queue;

import javax.management.Query;

public class UsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue=new ArrayDeque<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);

				System.out.println(queue);
		System.out.println(		queue.peek());
		System.out.println(queue.remove());
		
		System.out.println(queue);

	}

}
