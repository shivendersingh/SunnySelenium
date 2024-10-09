package Map;

import java.util.HashMap;

public class UnderstandingOfHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hasmap = new HashMap();
		hasmap.put(1, "Sunny");
		hasmap.put(2, "Sunny");
		hasmap.put(30, "Selenium");
		hasmap.put(40, "java");
		//System.out.println(hasmap.containsKey(0));
		//hasmap.get(1).equals(hasmap.get(2));
		System.out.println(hasmap.merge(1, " Hasija",(A, b) -> A + b));
		hasmap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

//		for (Map.Entry m : hasmap.entrySet()) {
//			System.out.println(m);
//
//		}
	
//		for (int i = 0; i <= hasmap.size(); i++) {
//			System.out.println(hasmap.get(i));
//			
//		}
	}
}
