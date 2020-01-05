package assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

//-Replacement of the @Test`s 'expected' attribute from JUnit4. 

//-Assert that execution of the supplied executable throwsan exception of the expectedType and returns the exception. 
//-If no exception is thrown, or if an exception of a different type isthrown, this method will fail. 
//-If you do not want to perform additional checks on the exception instance,simply ignore the return value. 
//-Fails with the supplied failure message.

//	<T extends Throwable> 	assertThrows​(Class<T> expectedType, Executable executable)	
//	<T extends Throwable>	assertThrows​(Class<T> expectedType, Executable executable, String message)	
//	<T extends Throwable>T	assertThrows​(Class<T> expectedType, Executable executable, Supplier<String> messageSupplier)	
	public class AssertThrows {

	@Test
	public void test1() {
		Exception exc = assertThrows(StringIndexOutOfBoundsException.class, () -> "".substring(5), "My message");
		assertEquals(exc.getMessage(), "String index out of range: -5");
	}
	
	@Test
	public void test2() {
		assertThrows(StringIndexOutOfBoundsException.class, () -> "abc".substring(1), "My message");
	}
	
}
