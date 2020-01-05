package annotations.before_after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class AfterAllTest {

	@AfterAll
	public static void init() {
		System.out.println("@AfterAll method called.");
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
