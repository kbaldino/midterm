package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {
	
	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;
	private static MyInteger myIntPrime;
	

	@BeforeClass
	public void setUpBeforeClass() throws Exception {
		myIntEven = new MyInteger(2);
		myIntOdd = new MyInteger(3);
		myIntPrime = new MyInteger(5);
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testIsEven(){
		MyInteger myIntEven = new MyInteger(2);
		MyInteger myIntOdd = new MyInteger(3);
		MyInteger myIntPrime = new MyInteger (5);
		
		assertTrue(myIntEven.isEven() == true);
		assertFalse(myIntOdd.isEven() == true);
		int x = 0;
		assertTrue(myIntPrime.isPrimee(x) == true);
		
	}
}
