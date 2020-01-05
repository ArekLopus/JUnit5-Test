package extensions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import javax.resource.spi.IllegalStateException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

//-Exceptions thrown during the test execution may be intercepted and handled accordingly before propagating further, so that certain actions
// like error logging or resource releasing may be defined in specialized Extensions. 
@ExtendWith(ExceptionHandlingExt.TestExecutionExceptionHandlerExtension.class)
public class ExceptionHandlingExt {
	
	@Test
	public void test1() throws IllegalStateException {
		assertThat(2 + 1, is(3));
	}
	
	@Test
	public void test2() throws IllegalStateException {
		throw new IllegalStateException("Bad state.");
	}
	
		
	static class  TestExecutionExceptionHandlerExtension implements TestExecutionExceptionHandler {

		@Override
		public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
			if (throwable instanceof IllegalStateException) {
	            System.err.println("Illegal State Exception: " + throwable.getMessage());
	            return;
	        }
	        throw throwable;
		}
		
	}
	
}
