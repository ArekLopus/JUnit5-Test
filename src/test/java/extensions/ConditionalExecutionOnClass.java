package extensions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

// If set on class level and and the first test is false - IT STOPS and skips all other tests.
@ExtendWith(ConditionalExecutionMethod.ConditionalExecutionExtension.class)
public class ConditionalExecutionOnClass {

	@Test
	@Tag("slow")
	public void test1() {
		System.out.println("@Test slow");
		assertThat(2 + 1, is(3));
	}
	
	@Test
	@Tag("fast")
	public void test2() {
		System.out.println("@Test fast");
		assertThat(2 + 1, is(3));
	}
	
	@Test
	public void test3() {
		System.out.println("@Test no @Tag");
		assertThat(2 + 1, is(3));
	}
	
}
