package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SimpeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> set2=new HashSet<>();
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(20);
		set.add(50);
		set.add(1);
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.remove(20));
		System.out.println(set.remove(100));
		System.out.println(set.contains(1));
		for(int i:set)
			System.out.println(i);
		
		set2.add(50);
		set.addAll(set2);
		
		
		System.out.println("usinge iterator");

		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			int j=itr.next();
			System.out.println(j);
		}
		
		System.out.println("sorted based on hoe they add : LinkedHashSet");
		LinkedHashSet<Integer> lset=new LinkedHashSet<>(set);
		System.out.println(lset);
		System.out.println("sorted based on hoe they add : TreeSet");

		TreeSet<Integer> tset=new TreeSet<>(set);
		System.out.println(tset);
	
	}

}
