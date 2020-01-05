package annotations.parameterized;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

//-The following placeholders are available:
//	{index}: invocations of the test method are counted, starting at 1; this placeholder gets replaced with the current invocation’s index
//	{arguments}: gets replaced with {0}, {1}, ... {n} for the method’s n parameters (so far we have only seen methods with one parameter)
//	{i}: gets replaced by the argument the i-th parameter has in the current invocation
public class ParameterizedTestNames {

	@ParameterizedTest(name = "run #{index} with [{arguments}]")
	@ValueSource(strings = { "Hello", "JUnit" })
	void withValueSource(String word) {}
	
	@DisplayName("Roman numeral")
	@ParameterizedTest(name = "\"{0}\" should be {1}")
	@CsvSource({ "I, 1", "II, 2", "V, 5"})
	void withName(String word, int number) { }
	
}
