package practice1;

public class PerimeterOfCircle {

	public double perimeterOfCircle(double r) {

		double perimeter = 0.0;
		double pi = 3.142;
		if (r != 0) {
			perimeter = 2 * pi * r;
		} else {
			System.out.println("if radius is 0 circle doesnt exist");
		}
		return perimeter;
	}

	public static void main(String[] args) {

		PerimeterOfCircle perimeter = new PerimeterOfCircle();
		double r = 0.0;
		double pmeter = perimeter.perimeterOfCircle(r);
		if (pmeter != 0) {
			System.out.println(pmeter);
		}

	}
}
