package assertions;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

//-Assert that actual is not null.

//	assertNotNull​(Object actual)	
//	assertNotNull​(Object actual, String message)	
//	assertNotNull​(Object actual, Supplier<String> messageSupplier)
public class AssertNotNull {
	
	@Test
	public void test1() {
		assertNotNull("One");
	}
	
}
