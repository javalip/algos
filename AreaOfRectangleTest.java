package practice1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaOfRectangleTest {

	
	@Test
	public void test() {
		AreaOfRectangle  areaOfRectangle = new AreaOfRectangle();
		double area = areaOfRectangle.areaOfRectangle(2.0, 4);
		assertSame(8.00, area);
	}

}
