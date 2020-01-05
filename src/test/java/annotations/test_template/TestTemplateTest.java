package annotations.test_template;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

//-A @TestTemplate method is not a regular test case but rather a template for test cases.
// As such, it is designed to be invoked multiple times depending on the number of invocation contexts returned by the registered providers.
// Thus, it must be used in conjunction with a registered TestTemplateInvocationContextProvider extension.
// Each invocation of a test template method behaves like the execution of a regular @Test method with full support
// for the same lifecycle callbacks and extensions.
public class TestTemplateTest {
	
	@TestTemplate
	@ExtendWith(TestTemplateTest.MyTestTemplateInvocationContextProvider.class)
	void testTemplate(String parameter) {
	    assertEquals(3, parameter.length());
	}
	
	
	static class MyTestTemplateInvocationContextProvider implements TestTemplateInvocationContextProvider {
	    
		@Override
	    public boolean supportsTestTemplate(ExtensionContext context) {
	        return true;
	    }
	    
	    @Override
	    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
	        return Stream.of(invocationContext("foo"), invocationContext("bar"));
	    }
	    
	    private TestTemplateInvocationContext invocationContext(String parameter) {
	        
	    	return new TestTemplateInvocationContext() {
	            
	    		@Override
	            public String getDisplayName(int invocationIndex) {
	                return parameter;
	            }

	            @Override
	            public List<Extension> getAdditionalExtensions() {
	                return Collections.singletonList(new ParameterResolver() {
	                    
	                	@Override
	                    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
	                        return parameterContext.getParameter().getType().equals(String.class);
	                    }

	                    @Override
	                    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
	                        return parameter;
	                    }
	                });
	            }
	        };
	    }
	}
}



