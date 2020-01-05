package annotations.repeated;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

// RepeatedTest.CURRENT_REPETITION_PLACEHOLDER		-> 1, 2, 3
// RepeatedTest.DISPLAY_NAME_PLACEHOLDER			-> My Test Name, My Test Name, My Test Name
// RepeatedTest.LONG_DISPLAY_NAME					-> My Test Name :: repetition 1 of 3, My Test Name :: repetition 2 of 3, My Test Name :: repetition 3 of 3, 
// RepeatedTest.SHORT_DISPLAY_NAME					-> repetition 1 of 3, repetition 2 of 3, repetition 3 of 3
// RepeatedTest.TOTAL_REPETITIONS_PLACEHOLDER		-> 3, 3, 3

public class RepeatedTestWithParameters {
	
	@DisplayName("My Test Name")
	@RepeatedTest(value = 3, name = "{displayName} - repetition {currentRepetition} / {totalRepetitions}")
	//@RepeatedTest(value = 3, name = RepeatedTest.CURRENT_REPETITION_PLACEHOLDER)
	public void test() {
		assertThat(2 + 1, is(3));
	}
	
}
