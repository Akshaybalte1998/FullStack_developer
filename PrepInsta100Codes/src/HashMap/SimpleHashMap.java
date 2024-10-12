package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "one");
		map.put(2, "two");
		
		System.out.println(map);
		boolean exist=map.containsKey(1);
		System.out.println(exist);
		
		String value=map.get(1);
		System.out.println(value);
		
		for(Map.Entry<Integer,String> emap:map.entrySet())
		{
			System.out.println(emap.getKey()+" "+emap.getValue());
		}
		
		map.put(3, "three");
		map.put(4, "foure");
		System.out.println(map);
		map.remove(2);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.getOrDefault(2,"not Found"));
	}

}
