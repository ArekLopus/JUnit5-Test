package assertions;

import static org.junit.jupiter.api.Assertions.assertNotSame;

import org.junit.jupiter.api.Test;

//-Assert that expected and actual do not refer to the same object.

//	assertNotSame​(Object unexpected, Object actual)	
//	assertNotSame​(Object unexpected, Object actual, String message)	
//	assertNotSame​(Object unexpected, Object actual, Supplier<String> messageSupplier)
public class AssertNotSame {
	
	@Test
	public void test1() {
		assertNotSame("One", "Two");
	}
	
}
