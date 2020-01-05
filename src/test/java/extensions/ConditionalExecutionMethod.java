package extensions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Set;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;

// Runs only tests with @Tag("fast").
// If set on class level and and the first test is false - IT STOPS and skips all other tests. 
public class ConditionalExecutionMethod {
	
	@Test
	@Tag("slow")
	@ExtendWith(ConditionalExecutionMethod.ConditionalExecutionExtension.class)
	public void test1() {
		System.out.println("@Test slow");
		assertThat(2 + 1, is(3));
	}
	
	@Test
	@Tag("fast")
	@ExtendWith(ConditionalExecutionMethod.ConditionalExecutionExtension.class)
	public void test2() {
		System.out.println("@Test fast");
		assertThat(2 + 1, is(3));
	}
	
	@Test
	@ExtendWith(ConditionalExecutionMethod.ConditionalExecutionExtension.class)
	public void test3() {
		System.out.println("@Test no @Tag");
		assertThat(2 + 1, is(3));
	}
	
	
	static class ConditionalExecutionExtension implements ExecutionCondition {
		
		@Override
		public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
			
			Set<String> tags = context.getTags();
			
			if(tags == null || tags.size() == 0)
				return ConditionEvaluationResult.disabled("Bad @Tag");
			
			for(String str : tags) {
				if(str != null && str.equals("fast"))
					return ConditionEvaluationResult.enabled("Right @Tag");
			}
			return ConditionEvaluationResult.disabled("Bad @Tag");
		}
	}
	
}
