package practice1;

public class StringReverse {

	public String stringReverse(String str) {

		String rstr = null;

		if (str != null && str.length() > 0) {

			rstr = new StringBuffer(str).reverse().toString();
		} else {
			System.out.println("Sting is empty");

		}

		return rstr;
	}

	public static void main(String[] args) {

		/*StringReverse reverse = new StringReverse();
		String rstr = reverse.stringReverse(null);
		if (rstr != null) {
			System.out.println(rstr);

		}*/
		StringReverse sReverse = new StringReverse();
		//String strReverse = sReverse.stringReverseNoInBuilt("Reverse this");
		String strReverse = sReverse.optimizedStringReverse("Reverse this String");
		System.out.println(strReverse);

		
	}

	public String stringReverseNoInBuilt(String str) {
		char[] cArray = str.toCharArray();
		char[] rCarray = new char[cArray.length];
		if (str != null && str.length() > 0) {

			int index = cArray.length - 1;
			for (int i = 0; i < cArray.length - 1||index>=0; i++) {
				rCarray[i] = cArray[index];
				System.out.println(rCarray[i]);
				index--;
			}
		} else {
			System.out.println("String is null");
		}

		String rStr = String.copyValueOf(rCarray);
		return rStr;
	}
	
	public String optimizedStringReverse(String str){
		char[] cArray = str.toCharArray();
		int n = cArray.length/2;
		System.out.print(n);
		int i=0;
		int index = str.length() -1;
		while(i<n){
			char temp = cArray[index];
			cArray[index] =cArray[i];
			cArray[i]=temp;
			System.out.println(cArray[i]);
			i++;
			index--;
		}
		String rstr = String.copyValueOf(cArray);
		return rstr;
		
	}
	
	public String reverseEachWord(String str){
		String [] words = str.split(",");
		
		String reverseString = "";
		for(int i =0; i<words.length;i++){
			
			String word = words[i];
			String reverseWord = "";
			for(int j =word.length()-1;j>=0;j--){
				reverseWord =reverseWord+word.charAt(j);
			}
			reverseString = reverseString+reverseWord;
		}
		return reverseString;
		
	}

}
