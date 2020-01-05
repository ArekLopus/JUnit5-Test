package assertions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

//-Assert that the supplied condition is true.

//	assertTrue​(boolean condition)	
//	assertTrue​(boolean condition, String message)	
//	assertTrue​(boolean condition, Supplier<String> messageSupplier)	
//	assertTrue​(BooleanSupplier booleanSupplier)	
//	assertTrue​(BooleanSupplier booleanSupplier, String message)	
//	assertTrue​(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier)
public class AssertTrue {
	
	@Test
	public void test1() {
		assertTrue(1 + 1 < 3);
	}
	
}
