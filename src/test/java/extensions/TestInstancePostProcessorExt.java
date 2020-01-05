package extensions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

// Common use cases include injecting dependencies into the test instance, invoking custom initialization methods on the test instance, etc.
@ExtendWith(TestInstancePostProcessorExt.TestInstancePostProcessorExtension.class)
public class TestInstancePostProcessorExt {
	
	@BeforeAll
	public static void init() {
		System.out.println("@BeforeAll");
	}

	@AfterAll
	public static void clean() {
		System.out.println("@AfterAll");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("@AfterEach");
	}

	@Test
	public void test() {
		System.out.println("@Test");
		assertThat(2 + 1, is(3));
	}
	
	
	static class TestInstancePostProcessorExtension implements TestInstancePostProcessor {

		@Override
		public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
			System.out.println("TestInstancePostProcessor");
		}
		
	}
	
}
