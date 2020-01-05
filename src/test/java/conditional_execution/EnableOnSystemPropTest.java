package conditional_execution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class EnableOnSystemPropTest {
	
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
	@Test
	public void test1() {
		System.out.println("64b arch test.");
	}
	
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
	@Test
	public void test2() {
		System.out.println("32b arch test.");
	}
	
}
