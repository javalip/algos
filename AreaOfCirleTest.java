package practice1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaOfCirleTest {

	
	@Test
	public void test() {
		Integer r = 5;
		Double area;
		Double calculatedArea = 3.142*5*5;
		AreaOfCirle areaOfCirle = new AreaOfCirle();
		area = areaOfCirle.areaOfCircle(r);
		assertEquals (calculatedArea,area);
		
	}

}
