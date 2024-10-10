package com.app.collectionUilts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class populatedList {

	public static List<Fruit> collectionOfAlll()
	{
		List<Fruit> addlist=new ArrayList<Fruit>();
		addlist.add(new Apple("apple","red",0.5,true));
		
		
		return addlist;
		
		
		
		
	}

	

}
