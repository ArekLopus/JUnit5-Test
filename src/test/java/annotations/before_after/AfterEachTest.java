package annotations.before_after;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AfterEachTest {
	
	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach method called.");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Hello World 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Hello World 2");
	}
	
}
