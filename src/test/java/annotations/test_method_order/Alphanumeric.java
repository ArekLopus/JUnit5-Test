package annotations.test_method_order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class Alphanumeric {

	@Test
    void testE() {
        assertEquals(1 + 2, 3);
    }

    @Test
    void testA() {
        assertEquals(1 + 2, 3);
    }

    @Test
    void testD() {
        assertEquals(1 + 2, 3);
    }
    
    @Test
    void testB() {
        assertEquals(1 + 2, 3);
    }
    
    @Test
    void testC() {
        assertEquals(1 + 2, 3);
    }

}
