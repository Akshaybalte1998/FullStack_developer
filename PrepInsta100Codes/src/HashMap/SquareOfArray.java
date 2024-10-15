package HashMap;

import java.util.HashMap;

public class SquareOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,5,6,7};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int key:array)
		{
			map.put(key, key*key);
		}
		System.out.println(map);
	}

}
