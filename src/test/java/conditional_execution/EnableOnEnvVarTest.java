package conditional_execution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnableOnEnvVarTest {
	
	@EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "4")
	@Test
	public void test1() {
		System.out.println("4 cores test.");
	}
	
	@EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "8")
	@Test
	public void test2() {
		System.out.println("8 cores test.");
	}
	
}
