package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	double perim = side1 + side2 + side3;

	@Test
	public void testToString() {
		System.out.println("testToString()");
		equals("The length of side one is: 1.0, side two is: 1.0, and side three is: 1.0");
	}

	@Test
	public void testGetPerimeter() {
		assertTrue (perim == 3);
	}
	
	@Test
	public void testGetArea() {
		double result1 = Math.sqrt((perim/2)*((perim/2)-side1)*((perim/2)-side2)*((perim/2)-side3));
	}

}
