package annotations.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//-Comparing to JUnit 4, this version of the annotation doesn't accept any parameters.
//-To check for a timeout or an exception thrown use assertions instead:
//    Assertions.assertTimeout(Duration.ofMillis(10), () -> bean.isNumberEven(3));
//    Assertions.assertThrows(NullPointerException.class, () -> bean.isNumberEven(null));
public class TestAnn {

	@Test
	public void test1() {
		
		Assertions.assertTimeout(Duration.ofMillis(10), () -> {
			Thread.sleep(5);
		});
	}
	
	@Test
	public void test2() {
		
		Exception exc = assertThrows(StringIndexOutOfBoundsException.class, () -> "".substring(5), "My message");
		assertEquals(exc.getMessage(), "String index out of range: -5");
	}
	
}
