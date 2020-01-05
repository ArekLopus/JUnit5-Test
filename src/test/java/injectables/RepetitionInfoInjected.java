package injectables;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

// RepetitionInfo - used only on test with @RepeatedTest and provides info regarding current repetition number or total of repetitions.
public class RepetitionInfoInjected {
	
	@RepeatedTest(value = 3)
	public void test(RepetitionInfo ri) {
		
		System.out.println("getCurrentRepetition() -> " + ri.getCurrentRepetition());
		System.out.println("getTotalRepetitions() -> " + ri.getTotalRepetitions());
		
	}
	
}
