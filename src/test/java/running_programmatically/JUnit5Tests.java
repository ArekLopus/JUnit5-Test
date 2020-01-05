package running_programmatically;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class JUnit5Tests {
	 
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