package com.hello;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CalculatorTest {
	private Calculator calculator;
	
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator(3,4);
	}
	
	@Test 
	public void testAddNumber() {
        //assertNotNull("app should have a greeting", classUnderTest.getGreeting());
        int result = calculator.addNumbers();
		assertEquals(result,7);
    }
    
    @Test 
	public void testSubtractNumber() {
        int result = calculator.subtractNumbers();
		assertEquals(result,-1);
    }
    
    @Test 
	public void testMultiplyNumber() {
        int result = calculator.multiplyNumbers();
		assertEquals(result,12);
    }
    
    @Test 
	public void testDivisionNumber() {
        double result = calculator.divisionNumbers();
		assertEquals(result, 0.75, 0.0);
    }
}
