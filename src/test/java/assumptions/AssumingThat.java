package assumptions;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

//-Execute the supplied Executable ONLY if the supplied assumption is valid. 

//-If the assumption is invalid, this method does nothing. 
//-If the executable throws an exception, it will be rethrown as is but masked as an unchecked exception.

//	assumingThat​(boolean assumption, Executable executable)	
//	assumingThat​(BooleanSupplier assumptionSupplier, Executable executable)
public class AssumingThat {

	@Test
	public void test1() {
		
		assumingThat(Integer.parseInt("1") == 2, () -> {
			System.out.println("test1");
			assertTrue(Integer.parseInt("1") == 1);
		});
		
	}
	
	@Test
	public void test2() {
		
		assumingThat(Integer.parseInt("1") == 1, () -> {
			System.out.println("test2");
			assertTrue(Integer.parseInt("1") == 1);
		});
		
	}
	
}
