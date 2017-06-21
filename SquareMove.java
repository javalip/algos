package practice1;

public class SquareMove {
		int x;
		int y;
	public SquareMove(int a,int b){
		this.x =a;
		this.y =b;
		
		
	}
	
	public int mvRight(int p){
		x = x+p;
		return x;
		
	}
	public boolean mvLeft(int p){
		x = x-p;
		return true;
		
	}
	
	public boolean mvTop(int p){
		y = y+p;
		return true;
		
	}
	
	public boolean mvBott(int p){
		y = y-p;
		return true;
		
	}
	
	public static void main(String[] args){
		
		SquareMove s = new SquareMove(5,5);
		int position = s.mvRight(5);
		System.out.println(position);
	}
	
}
