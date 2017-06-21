package practice1;

import java.util.HashSet;

public class StringDuplicates {
	
	public void findDuplicates(String str){
		char[] array = str.toCharArray();
		char[] darray = new char[array.length];
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<array.length;i++){
			if(!set.add(array[i])){
				System.out.println(array[i]);
			}
		}
		
	}
	
	
	public static void main(String args[]){
		StringDuplicates stringduplicates = new StringDuplicates();
		//stringduplicates.findDuplicates("aabbcccddd");
		stringduplicates.findDuplicates2("My name is Preeti Preeti");
	}
	
	public void findDuplicates2(String str){
		String[] sArray = str.split(" ");
		HashSet<String> set = new HashSet<String>();
		for(String i: sArray){
			if(!set.add(i)){
				System.out.println(i);
			}
		}
		
	}

}
