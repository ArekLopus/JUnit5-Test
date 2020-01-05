package annotations.parameterized;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTest_Test {

	@ArgumentsSource(BlankStringsArgumentsProvider.class)
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	@CsvSource(value = { "annCSV1,annCSV1", "annCSV2,annCSV2" }, delimiter = ':')
	@EmptySource
	@MethodSource("myMethod")
	@NullAndEmptySource
	@NullSource
	@ValueSource(strings = { "str1", "str2" }) // booleans, bytes, chars, classes, doubles, floats, ints, longs, shorts, strings
	@ParameterizedTest
	public void test(String str) {
		System.out.println("@ParameterizedTest, parameter -> " + str);
	}

	@EnumSource(MyEnum.class)
	@ParameterizedTest
	public void test2(MyEnum str) {
		System.out.println("@ParameterizedTest, parameter -> " + str);
	}

	private static String[] myMethod() {
		return new String[] { "methodStr1", "methodStr1" };
	}
	
}

class BlankStringsArgumentsProvider implements ArgumentsProvider {
	
	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
		return Stream.of(
				Arguments.of("Arguments Source1"),
				Arguments.of("Arguments Source2"));
	}
}