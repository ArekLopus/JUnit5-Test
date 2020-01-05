package assertions;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

//-Assert that actual is null.

//	assertNull​(Object actual)	
//	assertNull​(Object actual, String message)	
//	assertNull​(Object actual, Supplier<String> messageSupplier)
public class AssertNull {
	
	@Test
	public void test1() {
		assertNull(null);
	}
	
}
