package conditional_execution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class EnableOnJreTest {
	
	@EnabledOnJre(JRE.JAVA_8)
	@Test
	public void test1() {
		System.out.println("JRE 8 test.");
	}
	
	@EnabledOnJre(JRE.JAVA_13)
	@Test
	public void test2() {
		System.out.println("JRE 13 test.");
	}
	
}
