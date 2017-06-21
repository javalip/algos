package practice1;

public class CheckIfPanlidome {
	
	public static boolean isPalindome(String str){
		
		char[]sArray = str.toCharArray();
		int i =0;
		int j =sArray.length-1;
		int mid = (sArray.length-1)/2;
		while(i<=mid){
			if(sArray[i]!=sArray[j]){
				return false;
				
			}
			i++;
			j--;
		}
		
		return true;
		
	}
	
	public static void main(String[] args){
		System.out.print(CheckIfPanlidome.isPalindome("ponop"));
		
		
	}

}
