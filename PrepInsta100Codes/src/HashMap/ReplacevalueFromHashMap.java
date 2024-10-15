package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class ReplacevalueFromHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);

		map.put(3, 30);

		map.put(4, 40);
		map.put(5, 140);
		map.put(6, 100);
		
		for(Entry<Integer, Integer> key:map.entrySet())
		{
			System.out.println(key);
		}

	}

}
