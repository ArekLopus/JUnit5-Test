package annotations.test_method_order;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;

import org.junit.jupiter.api.MethodDescriptor;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrdererContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// Implement MethodOrderer interface to create a custom test order.
@TestMethodOrder(CustomOrder.ParameterCountOrder.class)
public class CustomOrder {

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
    
    
    static class ParameterCountOrder implements MethodOrderer {

        //private Comparator<MethodDescriptor> comparator = Comparator.comparingInt(md -> md.getMethod().getParameterCount());
    	private Comparator<MethodDescriptor> comparator = Comparator.comparing(md -> md.getMethod().getName());

        @Override
        public void orderMethods(MethodOrdererContext context) {
            context.getMethodDescriptors().sort(comparator.reversed());
            //context.getMethodDescriptors().sort(comparator);
        }
    }
    
}
