package annotations.display_name;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//-Test classes and test methods can declare custom display names via @DisplayName — with spaces, special characters, and even emojis — that
// will be displayed in test reports and by test runners and IDEs.
public class DisplayNameTest {
	
	@Test
	@DisplayName("Testing @DisplayName")	// without @DisplayName test name is the method name.
	public void test() {
		assertThat(2 + 1, is(3));
	}
	
}
