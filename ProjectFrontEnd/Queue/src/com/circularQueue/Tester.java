package com.circularQueue;

public class Tester {

	public static void main(String[] args) {

		Queue qq=new Queue(10);
		
		qq.add(10);
		qq.add(20);
		qq.add(30);
		qq.add(40);
		qq.add(50);
		qq.add(60);
		qq.add(70);
		System.out.println(" list is ");

		while(!qq.isEmpty())
		{
			System.out.println(qq.peek());
			qq.delete(); 

		}
	}

}
