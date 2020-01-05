package annotations.test_factory_dynamic_tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainer1 {
	
	@TestFactory
	@DisplayName("nested")
	Stream<DynamicNode> nestedTests() {
	  return Stream.of(DynamicContainer.dynamicContainer("nested",
	      Stream.of(
	          DynamicContainer.dynamicContainer("t1",
	              Stream.of(
	                  DynamicTest.dynamicTest("1", () -> assertTrue(true)),
	                  DynamicTest.dynamicTest("2", () -> assertTrue(true))
	              )),
	          DynamicTest.dynamicTest("t2", () -> assertTrue(true))
	      )));
	}
	
}
