package practice1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap();
		HashMap<Integer, String> hMap2 = new HashMap(10);
		
		

		hMap.put(1, "Preeti");
		hMap.put(2, "Preeti");
		hMap.put(3, "Ki");
		hMap.put(4, "mp");
		
		// See if Value exists

		boolean exists = false;
		exists = hMap.containsValue("m");
		System.out.println(hMap.get(1));
		System.out.println(exists);
		
		boolean exists1 = false;
		exists1 = hMap.containsValue("mp");
		System.out.println(exists1);
		
		// See if Key exists

		boolean kExists1 = false;
		kExists1 = hMap.containsKey(1);
		System.out.println(kExists1);
		
		boolean kExists = false;
		kExists = hMap.containsKey(8);
		System.out.println(kExists);
		
		System.out.println(hMap);
		// get key set from java hashmap example
		System.out.println("iterating");
		for(Map.Entry m:hMap.entrySet()){
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		
		// printing keys
		System.out.println("iterating to print keys");
		for(Integer m:hMap.keySet()){
			System.out.println(m);
		}
		
		HashMap<String, Integer> stringHmap = new HashMap();
		stringHmap.put("Preeti", 1);
		stringHmap.put("p2", 2);
		stringHmap.put("p", 4);
		stringHmap.put("cp", 4);
		stringHmap.put("googoo", 4);
		
		System.out.println("iterating to print String ========= keys");	
		for(String s:stringHmap.keySet()){
			System.out.println(s);
		}
	}
	

}
