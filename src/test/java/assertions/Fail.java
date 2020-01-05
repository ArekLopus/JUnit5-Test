package assertions;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

//-Fail the test without a failure message. 
// Although failing with an explicit failure message is recommended,this method may be useful when maintaining legacy code. 

//	fail()	
//	fail​(String message)	
//	fail​(String message, Throwable cause)	
//	fail​(Throwable cause)	
//	fail​(Supplier<String> messageSupplier)
public class Fail {
	
	@Test
	public void test1() {
		fail();
	}
	
}
