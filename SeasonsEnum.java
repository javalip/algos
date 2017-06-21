package practice1;

public enum SeasonsEnum {
	WINTER(0), SPRING(1), SUMMER(2), FALL(3);
	
	private int season;
	
	private SeasonsEnum(int season){
		this.season = season;
	}
	public Integer getSeason(){
		return season;
	}
	
	public static void main(String[] args){
		
		for(SeasonsEnum s:SeasonsEnum.values()){
			System.out.println(s);
		}
		
	}
	
	


}
