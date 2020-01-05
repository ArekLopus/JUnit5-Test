package conditional_execution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class EnableOnOsTest {
	
	@EnabledOnOs(OS.MAC)
	@Test
	public void test1() {
		System.out.println("Mac test.");
	}
	
	@EnabledOnOs(OS.WINDOWS)
	@Test
	public void test2() {
		System.out.println("Windows test.");
	}
	
}
