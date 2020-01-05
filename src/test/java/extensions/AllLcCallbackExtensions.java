package extensions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

@ExtendWith(AllLcCallbackExtensions.AllCallbacksExtension.class)
public class AllLcCallbackExtensions {

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
	
	
	
	static class AllCallbacksExtension implements TestInstancePostProcessor, BeforeAllCallback, BeforeEachCallback,
			BeforeTestExecutionCallback, AfterTestExecutionCallback, AfterEachCallback, AfterAllCallback {

		@Override
		public void beforeAll(ExtensionContext context) throws Exception {
			System.out.println("BeforeAllCallback");
		}

		@Override
		public void afterAll(ExtensionContext context) throws Exception {
			System.out.println("AfterAllCallback");
		}

		@Override
		public void afterEach(ExtensionContext context) throws Exception {
			System.out.println("AfterEachCallback");
		}

		@Override
		public void afterTestExecution(ExtensionContext context) throws Exception {
			System.out.println("AfterTestExecutionCallback");
		}

		@Override
		public void beforeTestExecution(ExtensionContext context) throws Exception {
			System.out.println("BeforeTestExecutionCallback");
		}

		@Override
		public void beforeEach(ExtensionContext context) throws Exception {
			System.out.println("BeforeEachCallback");
		}

		@Override
		public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
			System.out.println("TestInstancePostProcessor");
		}

	}
	
}
