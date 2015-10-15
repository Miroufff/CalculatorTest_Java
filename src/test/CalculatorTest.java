package test;

import math.CalculatorMain;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	protected CalculatorMain op;

	@Before
	public void setUp() {
		op = new CalculatorMain();
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testAdd() throws Exception {
		Long a = 1L;
		Long b = 3L; 
		op.add(a, b);
	}
	
	public void testMultiply() throws Exception {
		Long a = 1L;
		Long b = 3L; 
		op.multiply(a, b);
	}
}
