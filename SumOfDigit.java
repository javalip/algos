package practice1;

public class SumOfDigit {
	
	int findSumOfDigit(int num){
		int copyOfNum = num;
		int sum =0;
		
		while(copyOfNum!=0){
			int last = copyOfNum%10;
			sum=sum+last;
			copyOfNum=copyOfNum/10;
			
		}
		return sum;
	}

}
