package assertions;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

//-Assert that expected list of Strings matches actuallist. 
//-This method differs from other assertions that effectively only check String.equals(Object),in that it uses the following staged matching algorithm: 
// For each pair of expected and actual lines do 
// 1.check if expected.equals(actual) - if yes, continue with next pair
// 2.otherwise treat expected as a regular expression and check via String.matches(String) - if yes, continue with next pair
// 3.otherwise check if expected line is a fast-forward marker, if yes apply fast-forward actual lines accordingly (see below) and goto 1.

//	assertLinesMatch​(List<String> expectedLines, List<String> actualLines)	
//	assertLinesMatch​(List<String> expectedLines, List<String> actualLines, String message)	
//	assertLinesMatch​(List<String> expectedLines, List<String> actualLines, Supplier<String> messageSupplier)
public class AssertLinesMatch {
	
	@Test
	public void test1() {
		assertLinesMatch(Arrays.asList("One"), Arrays.asList("One"));
	}
	
}
