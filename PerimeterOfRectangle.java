package practice1;

public class PerimeterOfRectangle {

	public double perimeterOfRectangle(double length, double height) {

		double perimeter = 0;
		if (length != 0 && height != 0) {
			perimeter = 2 * (length + height);
		} else {
			System.out
					.println("if lenth or bredth is 0 then rectangle doesnt exist");
		}
		return perimeter;
	}

	public static void main(String[] args) {
		PerimeterOfRectangle perimeter = new PerimeterOfRectangle();
		double pmeter = perimeter.perimeterOfRectangle(0, 6);
		if (pmeter != 0) {
			System.out.println(pmeter);
		}

	}

}
