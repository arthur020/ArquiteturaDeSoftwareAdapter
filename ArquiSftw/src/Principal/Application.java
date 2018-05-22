package Principal;

import java.util.Map;

public class Application {

	public static void main(String[] args) {
		Integer[][] matrix = new Integer[][] { { 1, 2, 3, 4, 5 }, { 1, 4, 9, 16, 25 } };

		Map<Integer, Integer> hashMap = new HashMapAdapter<Integer>(matrix);


		for (Integer key : hashMap.keySet()) {
			System.out.println(key + " : " + hashMap.get(key));
		}

		System.out.println();

	}
}