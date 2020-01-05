package assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//-Assert that expected and actual are equal.

// For types: boolean, Boolean, byte, Byte, char, Character, double, Double, float, Float, int, Integer, long, Long, short, Short, Object
public class AssertEquals {
	
	@Test
	public void test1() {
		assertEquals(1 + 1, 2);
	}
	
}
