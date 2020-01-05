package assumptions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

//-Failed assumptions DO NOT result in a test failure; rather, a failed assumption results in a test being aborted.
// Test will show skipped test if failed assumptions.
//-Validate the given assumption.

//	assumeTrue​(boolean assumption)	
//	assumeTrue​(boolean assumption, String message)	
//	assumeTrue​(boolean assumption, Supplier<String> messageSupplier)	
//	assumeTrue​(BooleanSupplier assumptionSupplier)	
//	assumeTrue​(BooleanSupplier assumptionSupplier, String message)	
//	assumeTrue​(BooleanSupplier assumptionSupplier, Supplier<String> messageSupplier)
public class AssumeTrue {

	@Test
	public void test1() {
		
		assumeTrue(Integer.parseInt("1") == 2, ()->{ return "Not equal"; });
		
		assertTrue(Integer.parseInt("1") == 1);
	}
	
	@Test
	public void test2() {
		
		assumeTrue(Integer.parseInt("1") == 1);
		
		assertTrue(Integer.parseInt("1") == 1);
	}
	
}
