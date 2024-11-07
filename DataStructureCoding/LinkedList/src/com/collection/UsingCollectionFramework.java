package com.collection;

import java.util.LinkedList;

public class UsingCollectionFramework {

	public static void main(String[] args) {


		LinkedList<Integer> ll=new LinkedList<Integer>();
		System.out.println("add");
		ll.addFirst(10);
		ll.addFirst(20);

		ll.addFirst(30);
		ll.addFirst(40);
		System.out.println(ll);

		ll.addFirst(50);
		ll.addFirst(100);
		System.out.println(ll);

		ll.addFirst(210);
		ll.addFirst(310);
		System.out.println(ll);

		ll.addLast(70);
		ll.addLast(80);
		System.out.println(ll);

		ll.add(55);
		System.out.println(ll);

		System.out.println("added at specific postion");
		ll.add(5,1563589);
		System.out.println("list is : ");
		System.out.println(ll);
		System.out.println("size of list : "+ll.size());
		
		for(int i =0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+"->");
		}
		System.out.println("delete");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);

		ll.removeLast();
		System.out.println(ll);

		ll.remove(2);
		System.out.println(ll);

	}

}
