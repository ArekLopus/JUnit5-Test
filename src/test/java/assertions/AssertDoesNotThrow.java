package assertions;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

// Assert that execution of the supplied executable does not throw any kind of exception. 

//	assertDoesNotThrow​(Executable executable)	
//	assertDoesNotThrow​(ThrowingSupplier<T> supplier)	
public class AssertDoesNotThrow {
	
	@Test
	public void test1() {
		assertDoesNotThrow(() -> {
			return 1 + 1;
		});
	}
	
	@Test
	public void test2() {
		assertDoesNotThrow(() -> {
			throw new IllegalArgumentException();
		});
	}
}
