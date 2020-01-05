package assertions;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

//-Asserts that two object arrays are equal.
// If they are not, an AssertionError is thrown.
// If expected and actual are null, they are considered equal.

// For types: boolean, byte, char, double, float, int, long, short, Object
public class AssertArrayEquals {
	
	@Test
	public void test1() {
		assertArrayEquals(new String[] {"One"}, new String[] {"One"});
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new String[] {"One"}, new String[] {"one"});
	}
	
}
