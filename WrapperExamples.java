package practice1;

public class WrapperExamples {

	
	public static void main(String[]args){
		
		// parsing
		System.out.println(Integer.parseInt("9"));
		System.out.println(Double.parseDouble("9"));
		//autoboxing, valueof method is used intenally
		Integer i = 9;
		//unboxing
		Integer j = new Integer(9);
		int k = j;
		
		// using valueof
		int m = Integer.valueOf(k);
		String s ="9";
		int n = Integer.valueOf(s);
	
		
		// parsing
		Integer iS= Integer.parseInt("9");
		Double doS =Double.parseDouble("9");
		Integer p = Integer.parseInt("abc"); // throws number format exception
		
	}
}
