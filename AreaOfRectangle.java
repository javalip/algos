package practice1;

public class AreaOfRectangle {

	public double areaOfRectangle(double length, double height) {

		double area = 0.0;

		if (length != 0 && height != 0) {
			area = length * height;

		} else {
			System.out
					.println("Since Length or height  is 0 the rectangle cannot exist");
		}
		return area;
	}

	public static void main(String[] args) {

		AreaOfRectangle area = new AreaOfRectangle();

		double l = 1;
		double h = 1;
		double a = 0.0;
		a = area.areaOfRectangle(l, h);
		if (a != 0) {
			System.out.println("area of rectangle is " + a);
		}
	}
}
