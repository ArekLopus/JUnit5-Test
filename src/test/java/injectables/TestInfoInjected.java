package injectables;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

// TestInfo - allows to get information related to a test suite or test method such as display name, tags, test class.
public class TestInfoInjected {
	
	@Test
	@DisplayName("MyTest")
	@Tag("MyTag")
	public void test(TestInfo ti) {
		
		System.out.println("getDisplayName() -> " + ti.getDisplayName());
		System.out.println("getTags() -> " + ti.getTags());
		System.out.println("getTestClass() -> " + ti.getTestClass());
		System.out.println("getTestMethod() -> " + ti.getTestMethod());
		
	}
	
}
