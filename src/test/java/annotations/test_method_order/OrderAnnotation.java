package annotations.test_method_order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotation {

    @Test
    @Order(1)
    void testE() {
        assertEquals(1 + 2, 3);
    }

    @Test
    void testA() {
        assertEquals(1 + 2, 3);
    }

    @Test
    @Order(2)
    void testD() {
        assertEquals(1 + 2, 3);
    }
    
    @Test
    @Order(4)
    void testB() {
        assertEquals(1 + 2, 3);
    }
    
    @Test
    @Order(3)
    void testC() {
        assertEquals(1 + 2, 3);
    }
    
}
