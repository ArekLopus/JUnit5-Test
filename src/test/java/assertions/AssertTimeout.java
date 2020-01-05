package assertions;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

//-Replacement of the @Test`s 'timeout' attribute from JUnit4. 

//-Assert that execution of the supplied executable completes before the given timeout is exceeded. 
//-Note: the executable will be executed in the same thread as that of the calling code.
// Consequently, execution of the executable will not be preemptively aborted if the timeout is exceeded.

//	assertTimeout​(Duration timeout, Executable executable)	
//	assertTimeout​(Duration timeout, Executable executable, String message)	
//	assertTimeout​(Duration timeout, Executable executable, Supplier<String> messageSupplier)	
//	assertTimeout​(Duration timeout, ThrowingSupplier<T> supplier)	
//	assertTimeout​(Duration timeout, ThrowingSupplier<T> supplier, String message)	
//	assertTimeout​(Duration timeout, ThrowingSupplier<T> supplier, Supplier<String> messageSupplier)
public class AssertTimeout {

	@Test
	public void test1() {
		assertTimeout(Duration.ofMillis(20), () -> {
			Thread.sleep(10);
		});
	}
	
	@Test
	public void test2() {
		assertTimeout(Duration.ofMillis(1), () -> {
			Thread.sleep(10);
		});
	}
	
}
