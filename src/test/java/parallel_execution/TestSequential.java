package parallel_execution;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSequential {
	
	public static long timer = 0;
	
	@BeforeAll
	public static void init() {
		timer = System.currentTimeMillis();
	}
	@AfterAll
	public static void clean() {
		System.out.println("Time (ms): " + (System.currentTimeMillis() - timer));
	}
	
	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(1000);
	}
	
}
