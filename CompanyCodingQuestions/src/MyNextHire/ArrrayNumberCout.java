package MyNextHire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrrayNumberCout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4, 4, 5, 7, 4, 5, 3, 9, 9, 9, 9};
        Map<Integer, List<Integer>> groupedNumbers = new HashMap<>();

        for (int number : numbers) {
            groupedNumbers.putIfAbsent(number, new ArrayList<>());
            groupedNumbers.get(number).add(number);
        }

        System.out.println("Grouped Numbers:");
        for (Map.Entry<Integer, List<Integer>> entry : groupedNumbers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
