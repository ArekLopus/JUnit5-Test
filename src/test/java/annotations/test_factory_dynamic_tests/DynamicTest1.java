package annotations.test_factory_dynamic_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTest1 {
	
	@TestFactory
	public List<DynamicTest> testWithLambdas() {
		return Arrays.asList(
			DynamicTest.dynamicTest("Dynamic square: " + 2, () -> assertEquals(4, 2 * 2)),
			DynamicTest.dynamicTest("Dynamic true: " + true, () -> assertTrue(true))
		);
	}
	
	@TestFactory
	public List<DynamicTest> testWithMethodReferences() {
		return Arrays.asList(
			DynamicTest.dynamicTest("Dynamic square: " + 2, this::methodSquareTest),
			DynamicTest.dynamicTest("Dynamic true: " + true, this::methodTrueTest)
		);
	}
	
	
	public void methodSquareTest() {
		assertEquals(4, 2 * 2);
	}
	
	public void methodTrueTest() {
		//assertTrue(true);
		assertTrue(false);
	}
}
