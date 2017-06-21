package practice1;

import java.util.HashMap;
import java.util.Map;

public class StroingCountOccurances {
	
	void  countOccurances(String string){
		Map< Character, Integer> sMap = new HashMap< Character, Integer>();
		char[] cArray = string.toCharArray();
		for(int i=0; i<cArray.length;i++){
			if(sMap.containsKey(cArray[i])){
				sMap.put(cArray[i], sMap.get(cArray[i])+1) ;
			}else{
				sMap.put(cArray[i], 1);
			}
		}
		System.out.println(sMap);
		
	}
	
	void countOccurancesOfWords(String string){
		String[] words = string.split(" ");
		Map<String, Integer> wMap = new HashMap<String,Integer>();
		for(String word:words){
			if(wMap.containsKey(word)){
				wMap.put(word, wMap.get(word)+1);
			}else{
				wMap.put(word, 1);
			}
		}
		System.out.println(wMap);
		
	}
	
	 int countNumberOfWordsInString(String str){
		 String[] words = str.split((" "));
		 
		int numberOfWordsInString = words.length;
		 return numberOfWordsInString;
		
	}
	public static void main(String []args){
		
		StroingCountOccurances stringOccurances = new StroingCountOccurances();
		
		stringOccurances.countOccurances("Preeti");
		
	}

}
