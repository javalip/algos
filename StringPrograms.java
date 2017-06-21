package practice1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringPrograms {
	
	public String RemovWhiteSpace(String string){
		String strWithoutSpace = string.replaceAll("\\s", "");
		return strWithoutSpace;
	}

	public Boolean isAnagram(String string1, String string2){
		if(string1!=null&& string2!=null){
			Boolean isAnagram = true;
			String string1Copy = string1.replaceAll("\\s", "");
			String string2Copy = string2.replaceAll("\\s", "");
			if(string1Copy.length()!=string2Copy.length()){
				isAnagram = false;
			}else{
				// copy everything to lowercase
				char[] cArray1 = string1Copy.toLowerCase().toCharArray();
				char[] cArray2 = string2Copy.toLowerCase().toCharArray();
				
					Arrays.sort(cArray1);
					Arrays.sort(cArray2);
					if(Arrays.equals(cArray1,cArray2)){
						isAnagram = true;
					}else{
						isAnagram = false;
					}
			}
			return isAnagram;
			
		}else{
			return null;		
		}
		
	}
	
	public static void removeDuplicates(char[] str) {
		if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		int tail =1;
		for(int i =1; i<len; ++i){
			int j;
			for (j = 0; j < tail; ++j) {
			if (str[i] == str[j]) break; 
			}
			if (j == tail) { 
				str[tail] = str[i];
				++tail;
				}
		}
		str[tail] = 0;
		}
	
	public Set removeDupes(char[] str){
		Set<Character> hset = new LinkedHashSet();
		for(int i =0; i <str.length;i++){
			hset.add(str[i]);
		}
		return hset;
	}
	
	public char[] dedupe(char[] str){
		
		char[] dArray = new char[str.length];
		int index =0;
		boolean isDuplicate = false;
		for(int i=0;i<str.length;i++){
			isDuplicate = false;
			 for(int j=0;j<dArray.length;j++){
				 if(str[i]==dArray[j]){
					 isDuplicate = true;
					 break;
				 }
			 }
			 if(!isDuplicate){
				 dArray[index]=str[i];
				 index++;
			 }
		}
		return dArray;
		
	}
	
	
	public static void main(String args[]){
		StringPrograms stringPrograms = new StringPrograms();
		Boolean isAnagram = stringPrograms.isAnagram("Mother in law", "Hitler");
		if(isAnagram){
			System.out.println(isAnagram);
		}else{
			System.out.println("isAnagram false");
		}
		
		char[] cArray = new char[] {'c', 'c','b','t','b'};
		Set<Character> s = new LinkedHashSet<Character>();
		s= stringPrograms.removeDupes(cArray);
		System.out.println("Deduped");
		for(Character c:s){
			System.out.println(c);
		}
		
		// String concatination using concat
		String s1 = new String("Preeti");
		String s2 = new String("Preeti");
		String s4 = new String("Preeti");
		String ss = s1.concat(s2);
		System.out.println(ss);
		System.out.println(s4.concat(ss));
		System.out.println(ss.concat(s4));
		
		
		
		
		
	}
}
