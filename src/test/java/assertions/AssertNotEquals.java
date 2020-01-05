package assertions;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

//-Assert that expected and actual are not equal.

// For types: boolean, Boolean, byte, Byte, char, Character, double, Double, float, Float, int, Integer, long, Long, short, Short, Object
public class AssertNotEquals {
	
	@Test
	public void test1() {
		assertNotEquals(1, 2);
	}
	
}
