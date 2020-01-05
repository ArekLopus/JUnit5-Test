package annotations.test_factory_dynamic_tests;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class ParameterizedTest {
	
	@TestFactory
	Stream<DynamicTest> test1() {
		
		List<String> testData = Arrays.asList("One", "Two", "Three");
		
		return testData.stream()
			.map(str -> DynamicTest.dynamicTest("Testing " + str, () -> {
				assertTrue(str.length() > 2);
			}));
	}
	
	@TestFactory
	Stream<DynamicTest> test2() {
		
		List<String> testData = Arrays.asList("One", "Two", "Three");
		
		return testData.stream()
			.map(str -> DynamicTest.dynamicTest("Testing " + str, () -> {
				assertTrue(str.length() > 3);
			}));
	}
	
}
