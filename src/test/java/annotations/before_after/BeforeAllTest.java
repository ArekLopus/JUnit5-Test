package annotations.before_after;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllTest {

	@BeforeAll
	public static void init() {
		System.out.println("@BeforeAll method called.");
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
