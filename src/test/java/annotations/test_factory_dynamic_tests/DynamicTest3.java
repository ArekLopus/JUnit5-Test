package annotations.test_factory_dynamic_tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTest3 {

	@TestFactory
	Stream<DynamicTest> test() {
		return IntStream.iterate(0, n -> ++n).limit(5)
				.mapToObj(n -> DynamicTest.dynamicTest("testPowFor" + n, () -> assertEquals(pow(n), n * n)));
	}

	public int pow(int a) {
		return a * a;
	}
	
}
