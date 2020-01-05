package annotations.test_method_order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// To configure a custom seed use junit.jupiter.execution.order.random.seed in the 'junit-platform.properties' properties file.
//	junit-platform.properties
//	junit.jupiter.execution.order.random.seed=99

// E A D B C - 1st test
// C Y A Z B - 2nd test
// D A E C B - 3rd test
@TestMethodOrder(MethodOrderer.Random.class)
public class Random {

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
