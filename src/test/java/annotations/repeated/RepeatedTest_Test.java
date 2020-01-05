package annotations.repeated;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTest_Test {
	
	@RepeatedTest(3)
	public void test() {
		System.out.println("Testing.");
	}
	
}
