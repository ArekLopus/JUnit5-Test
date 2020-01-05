package assertions;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

//-Assert that expected and actual refer to the same object.

//	assertSame​(Object expected, Object actual)	
//	assertSame​(Object expected, Object actual, String message)	
//	assertSame​(Object expected, Object actual, Supplier<String> messageSupplier)
public class AssertSame {
	
	@Test
	public void test1() {
		assertSame("One", "One");
	}
	
}
