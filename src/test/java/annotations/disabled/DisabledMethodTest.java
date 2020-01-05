package annotations.disabled;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// Shows 1 skipped test
public class DisabledMethodTest {
	
	@Test
	@Disabled("Do not run this test")
	public void test() {
		System.out.println("Testing With Disabled On Method Level");
	}
	
	
	@Test
	public void testWithoutDisabled() {
		assertTrue(Integer.parseInt("1") == 1);
	}
	
}
