package practice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DedupeAnArray {
	public int[] dedupeAnArray(int[] array) {
		int[] dArray = new int[array.length];
		int index = 0;
		boolean isDupe = false;
		if (array.length != 0 && array != null) {
			for (int i = 0; i < array.length; i++) {
				isDupe = false;
				for (int j = 0; j < dArray.length; j++) {
					if (array[i] == dArray[j]) {
						isDupe = true;
						break;
					}
				}
				if (!isDupe) {
					dArray[index] = array[i];
					index++;
				}
			}
		} else {
			System.out.println(" Array is empty");
		}
		int[] finalArray = new int[index];
		for (int i = 0; i < finalArray.length; i++) {
			finalArray[i] = dArray[i];
		}
		return finalArray;
	}
	
	public int[] findDupes(int[] array){
		
		int[] dArray = new int[array.length];
		int[] dupes = new int[array.length];
		int index = 0;
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					dupes[index]=array[i];
					index++;
				}
			}
		}
		return dupes;
	}
	
	public void findDupes2(int[] array){
		
		int[] dArray = new int[array.length];
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> dset = new HashSet<Integer>();
		int index = 0;
		List<Integer> dupes = new ArrayList<Integer>();
		for(int i:array){
			if(!set.add(i)){
				if(!dupes.contains(i)){
					System.out.println(i);
					dupes.add(i);
				}
				
			}
		}
	
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 2, 4, 5, 7, 9, 9, 9, 10 };

		DedupeAnArray dedupeArray = new DedupeAnArray();
		/*int[] finArray = dedupeArray.dedupeAnArray(array);

		for (int i = 0; i < finArray.length; i++) {
			System.out.println(finArray[i]);
		}
		int[] array1 = new int[] {};
		DedupeAnArray dedupeArray1 = new DedupeAnArray();
		int[] finArray1 = dedupeArray1.dedupeAnArray(array1);
		for (int i = 0; i < finArray1.length; i++) {
			System.out.println(finArray1[i]);
		}*/
		
		 dedupeArray.findDupes2(array);
	
	}
}
