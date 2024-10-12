package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ArrayToHashMapWithCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,10,20,10,30,20,50};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int key:arr)
		{
			map.put(key, map.getOrDefault(key, 0)+1);
//			if(map.containsKey(key))
//			{
//				int value=map.get(key);
//				map.put(key,value+1);
//
//			}
//			else
//				map.put(key, 1);
		}
		
		
		
		for(Entry<Integer,Integer> emap:map.entrySet())
			System.out.println(emap);
		System.out.println(map);
		
		
		TreeMap<Integer,Integer> tmap=new TreeMap<>(map);
		System.out.println(tmap);
	}

}
