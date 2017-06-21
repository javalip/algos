package practice1;

public class AreaOfCirle {

	public double areaOfCircle(int r) {

		double area = 0.0;
		if (r != 0) {
			double pi = 3.142;
			area = pi * r * r;
		} else {
			System.out.println("When Radius is zero the circle doesnt exist");
		}
		return area;
	}
	public static void main(String []args){
	
		AreaOfCirle area = new AreaOfCirle();		
double cArea =	area.areaOfCircle(2);

if (cArea != 0){
	System.out.println("Area of circle is "+cArea);
}else {
	
	System.out.print("You already know  radius is zero");
}
	
	}
}
