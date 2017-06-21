package practice1;

import java.util.Arrays;

public class ArraysEquality {
	
	public boolean isArraysEqual(String[] array1, String[] array2){
		
		char[] cArray1 = array1.toString().toCharArray();
		char[] cArray2 = array2.toString().toCharArray();
		
		 boolean isEqual = true;
		 
		 if(!Arrays.equals(cArray1, cArray1)){
			 isEqual = false;
			 return isEqual;
		 }
		return isEqual;
	}
	
	public boolean isArraysEqual2(String[] array1, String[] array2){
		boolean isEqual = true;
		if(array1!=null&&array2!=null&&array1.length>0&&array2.length>0){
			if(array1.length!=array2.length){
				isEqual = false;
				return  isEqual;
			}else{
				for(int i=0;i<array1.length;i++){
					if(array1[i]!=array2[i]){
						return false;
					}
				}
			}
			
		}else {
			System.out.println("input nor valid");
		}
		return isEqual;
		
	}
	// checking equality of two dimentional array
	public boolean isEquals4(String[][] array1, String[][]array2){
		boolean  isEqual = false;
		if(Arrays.deepEquals(array1, array2)){
			isEqual = true;
			return isEqual;
		}
		return isEqual;
	}
	
	

}
