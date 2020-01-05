package parallel_execution;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

//-The first one must be set as a property to run parallel test, the second one may be set as a property or on @Execution annotation.
//junit.jupiter.execution.parallel.enabled = true
//junit.jupiter.execution.parallel.mode.default = concurrent 

//-Run with VM arguments or put it in src/main/resources/junit-platform.properties:
//	-Djunit.jupiter.execution.parallel.enabled=true

// If run as parallel -> Time (ms): 1031
@Execution(ExecutionMode.CONCURRENT)
public class TestParallel {
	
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
