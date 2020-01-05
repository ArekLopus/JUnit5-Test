package assertions;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;

import org.junit.jupiter.api.Test;

//-Assert that execution of the supplied executable completes before the given timeout is exceeded. 
//-Note: the executable will be executed in a different thread than that of the calling code.
// Furthermore, execution of the executable will be preemptively aborted if the timeout is exceeded.
//-See the Preemptive Timeouts section of the class-level Javadoc for a discussion of possible undesirable side effects.

//	assertTimeoutPreemptively​(Duration timeout, Executable executable)	
//	assertTimeoutPreemptively​(Duration timeout, Executable executable, String message)	
//	assertTimeoutPreemptively​(Duration timeout, Executable executable, Supplier<String> messageSupplier)	
//	assertTimeoutPreemptively​(Duration timeout, ThrowingSupplier<T> supplier)	
//	assertTimeoutPreemptively​(Duration timeout, ThrowingSupplier<T> supplier, String message)	
//	assertTimeoutPreemptively​(Duration timeout, ThrowingSupplier<T> supplier, Supplier<String> messageSupplier)
public class AssertTimeoutPreemptively {

	@Test
	public void test1() {
		assertTimeoutPreemptively(Duration.ofMillis(20), () -> {
			Thread.sleep(10);
		});
	}
	
	@Test
	public void test2() {
		assertTimeoutPreemptively(Duration.ofMillis(1), () -> {
			Thread.sleep(10);
		});
	}
	
}
