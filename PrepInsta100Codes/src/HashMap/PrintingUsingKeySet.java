package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class PrintingUsingKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(4, 40);
		map.put(5, 140);
		map.put(6, 100);
		map.put(3, 30);

		for(Integer key:map.keySet())
			System.out.println(key+" " +map.get(key));
		
		LinkedHashMap<Integer,Integer> lmap=new LinkedHashMap<>(map);
		System.out.println(lmap);
		TreeMap<Integer,Integer> tmap=new TreeMap<>(map);
		System.out.println(tmap);
	}

}
