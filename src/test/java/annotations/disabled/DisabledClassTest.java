package annotations.disabled;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// Shows 2 skipped test
@Disabled("Do not run these test")
public class DisabledClassTest {
	
	@Test
	public void test() {
		System.out.println("Testing With Disabled On Class Level 1");
	}
	
	
	@Test
	public void testWithoutDisabled() {
		System.out.println("Testing With Disabled On Class Level 2");
	}
	
}
