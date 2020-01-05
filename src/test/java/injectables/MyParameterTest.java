package injectables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

//-Other parameter resolvers must be explicitly enabled by registering appropriate extensions via @ExtendWith.
@ExtendWith(MyParameterResolver.class)
public class MyParameterTest {
	
	@Test
	public void test(MyParameter mp) {
		
		System.out.println("getInfo() -> " + mp.getInfo());
		System.out.println("getAnotherInfo() -> " + mp.getAnotherInfo());
		
	}
	
}
