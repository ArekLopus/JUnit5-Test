package assertions;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

//-Assert that expected and actual iterables are deeply equal.

//	assertIterableEquals​(Iterable<?> expected, Iterable<?> actual)	
//	assertIterableEquals​(Iterable<?> expected, Iterable<?> actual, String message)	
// 	assertIterableEquals​(Iterable<?> expected, Iterable<?> actual, Supplier<String> messageSupplier)
public class AssertIterableEquals {
	
	@Test
	public void test1() {
		
		Iterable<String> i1 = Arrays.asList("One");
		Iterable<String> i2 = Arrays.asList("One");
		
		assertIterableEquals(i1, i2);
	}
	
}
