package annotations.before_after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ABeforeAfterTest {

	@BeforeAll
	public static void init() {
		System.out.println("@BeforeAll method called.");
	}
	@AfterAll
	public static void clean() {
		System.out.println("@AfterAll method called.");
	}
	
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach method called.");
	}
	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach method called.");
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
