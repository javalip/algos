package practice1;

public class FindLargestDigitNotContainingNumber {
	
	 int findNumber(int number, int digit){
		 char c = Integer.toString(digit).charAt(0);
		 for(int i=number;i>0;--i){
			if( Integer.toString(i).indexOf(c)==-1){
				return i;
				
			}
		 }
		 return -1;
		
	}

}
