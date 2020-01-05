package assumptions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.Test;

//-Failed assumptions DO NOT result in a test failure; rather, a failed assumption results in a test being aborted.
// Test will show skipped test if failed assumptions.
//-Validate the given assumption.

//	assumeFalse​(boolean assumption)	
//	assumeFalse​(boolean assumption, String message)	
//	assumeFalse​(boolean assumption, Supplier<String> messageSupplier)	
//	assumeFalse​(BooleanSupplier assumptionSupplier)	
//	assumeFalse​(BooleanSupplier assumptionSupplier, String message)	
//	assumeFalse​(BooleanSupplier assumptionSupplier, Supplier<String> messageSupplier)
public class AssumeFalse {

	@Test
	public void test1() {
		
		assumeFalse(Integer.parseInt("1") == 2, ()->{ return "Not equal"; });
		
		assertTrue(Integer.parseInt("1") == 1);
	}
	
	@Test
	public void test2() {
		
		assumeFalse(Integer.parseInt("1") == 1, ()->{ return "Equal"; });
		
		assertTrue(Integer.parseInt("1") == 1);
	}
	
}
