package annotations.test_instance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class PerClassTest {
	
	private int counter = 1;
	
	@Test
	public void test1() {
		System.out.println("Counter = " + counter ++);
	}
	
	@Test
	public void test2() {
		System.out.println("Counter = " + counter ++);
	}
	
}
