package assertions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

//-Assert that all supplied executables do not throw exceptions.

//	assertAll​(String heading, Collection<Executable> executables)	
//	assertAll​(String heading, Stream<Executable> executables)	
//	assertAll​(String heading, Executable... executables)	
//	assertAll​(Collection<Executable> executables)	
//	assertAll​(Stream<Executable> executables)	
//	assertAll​(Executable... executables)
public class AssertAll {

	@Test
	public void test1() {
		assertAll(
			() -> assertEquals(1 + 1, 2),
	        () -> assertTrue("John".length() < 5)		
		);
	}
	
}
