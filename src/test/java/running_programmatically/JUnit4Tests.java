package running_programmatically;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JUnit4Tests {
	 
    @Test
    public void test1() {
        assertTrue(true);
    }
 
    @Test
    public void test2() {
        assertFalse(false);
    }
 
    @Test
    public void test3() {
        assertNotNull("Abc");
    }
}