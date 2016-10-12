package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString(){
	    assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(10 ,Calculator.add("1,2,3,4"));
	}

	@Test
	public void testNewLineBetweenNumbers(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public void testIgnorNumbersBiggerThan1000(){
		assertEquals(2, Calculator.add("1001,2"));
	}
}
