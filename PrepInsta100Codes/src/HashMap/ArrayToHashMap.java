package HashMap;

import java.util.HashMap;

public class ArrayToHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		HashMap<Integer,Integer> map=new HashMap<>();
		int key=1;
		for(int i:arr)
		 	map.put(key++, i);
		System.out.println(map);
	}

}
