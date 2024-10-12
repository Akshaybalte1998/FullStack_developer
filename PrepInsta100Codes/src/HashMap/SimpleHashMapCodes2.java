package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class SimpleHashMapCodes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);

		map.put(3, 30);

		map.put(4, 40);
		map.put(5, 140);
		map.put(6, 100);
		
		System.out.println(map);
		
		for(Entry<Integer, Integer> emap: map.entrySet())
		{
			System.out.println(emap);
		}
		
		System.out.println(map.replace(5,  50));
		System.out.println(map.remove(6));
		System.out.println(map.containsKey(5));
		System.out.println(map.containsKey(6));
		System.out.println(map.containsValue(50));
		System.out.println(map.containsValue(100));
		
		System.out.println("priting map using loop");
		for(Entry<Integer, Integer> empa:map.entrySet())
		{
			System.out.println(empa);
		}
		

	}

}
