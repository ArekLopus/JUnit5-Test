package parallel_execution;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SimpleTest {
	
	
	@Test
	public void test() {
		assertThat(2 + 1, is(3));
	}
	
}
