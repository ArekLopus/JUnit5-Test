package annotations.before_after;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeEachTest {

	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach method called.");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Testing 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Testing 2");
	}
	
}
