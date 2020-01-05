package extensions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import injectables.MyParameter;

// Common use cases include injecting dependencies into the test instance, invoking custom initialization methods on the test instance, etc.
@ExtendWith(ParameterResolutionExt.MyParameterResolverExtension.class)
public class ParameterResolutionExt {
	
	@Test
	public void test(MyParameter mp) {
		
		System.out.println("getInfo() -> " + mp.getInfo());
		System.out.println("getAnotherInfo() -> " + mp.getAnotherInfo());
		
	}
	
	
	static class MyParameterResolverExtension implements ParameterResolver {
		
		@Override
		public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
			return (parameterContext.getParameter().getType() == MyParameter.class);
		}

		@Override
		public MyParameter resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
			return new MyParameter("Default Info", "Default AnotherInfo");
		}
		
	}
	
}
