package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListExample {
	
	public static void main (String []args){
		//creating synchronized arraylist
		List list = Collections.synchronizedList(new ArrayList<String>());
		//creatign synchronized map.
		Map hashmap = Collections.synchronizedMap(new HashMap<Integer,String>());
		Set set = Collections.synchronizedSet(new HashSet<String>());

		
		
		// creating un modifiable list
		Collections.unmodifiableList(list);
		Collections.unmodifiableMap(hashmap);
		Collections.unmodifiableSet(set);
		
		// sorting list with case insensitive manner
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		ArrayList arraylist = new ArrayList();
		
		// adding elements to arraylist
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add("5");
		
		List ll = new LinkedList();
		ll.add(1);
		ll.addAll(arraylist);
		ll.get(0);
		System.out.println("value from linked list "+ll.get(0));
		
		// adding arraylist to a specified index
		
		/***add method DOES NOT overwrites the element previously
	      at the specified index in the list. It shifts the elements to right side
	      and increasing the list size by 1.**/	
		arraylist.add(2, "Element Inserted");		
		for(int i=0;i<arraylist.size(); i++){
			System.out.println(arraylist.get(i));
		}
		
Object[] sarray = arraylist.toArray();
		System.out.println("=============Printing Array");
		
		for(int j =0;j<sarray.length; j++){
			System.out.println(sarray[j]);
		}
		
		List<Integer> intArray = new ArrayList();
		
	}

}
