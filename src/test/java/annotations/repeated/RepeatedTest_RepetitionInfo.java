package annotations.repeated;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTest_RepetitionInfo {
	
	@RepeatedTest(2)
	public void test(RepetitionInfo ri) {
		
		System.out.println("getCurrentRepetition() -> " + ri.getCurrentRepetition());
		System.out.println("getTotalRepetitions() -> " + ri.getTotalRepetitions());
	}
	
}
