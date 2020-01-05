package annotations.test_instance;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//With the "per-class" mode it becomes possible to declare @BeforeAll and @AfterAll on non-static methods as well as on interface default methods.
@TestInstance(Lifecycle.PER_CLASS)
public class PerClassNonStaticLcMethods {
	
	private int counter = 1;
	
	@Test
	public void test1() {
		System.out.println("Counter = " + counter ++);
	}
	
	@Test
	public void test2() {
		System.out.println("Counter = " + counter ++);
	}
	
	
	@BeforeAll
	public void init() {
		System.out.println("@BeforeAll is not static.");
	}
	
	@AfterAll
	public void clean() {
		System.out.println("@AfterAll is not static.");
	}
}
