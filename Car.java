package practice1;

public class Car {
	
	private String color;
	private String  make;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public static void main(String args[]){
		
		Car mycar = new Car();
		mycar.setColor("red");
		mycar.setMake("BMW");
		
		Car othercar = mycar;
		othercar.setColor("blue");
		System.out.println(mycar.getColor());
		
	}

}
