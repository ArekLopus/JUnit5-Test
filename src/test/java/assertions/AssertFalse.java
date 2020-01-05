package assertions;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

//-Assert that the supplied condition is false.

//	assertFalse​(boolean condition)	
//	assertFalse​(boolean condition, String message)	
//	assertFalse​(boolean condition, Supplier<String> messageSupplier)	
//	assertFalse​(BooleanSupplier booleanSupplier)	
//	assertFalse​(BooleanSupplier booleanSupplier, String message)	
//	assertFalse​(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier)
public class AssertFalse {
	
	@Test
	public void test1() {
		assertFalse(1 + 1 > 3);
	}
	
}
