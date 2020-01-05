package injectables;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import injectables.RandomParametersResolver.Random;

//-Other parameter resolvers must be explicitly enabled by registering appropriate extensions via @ExtendWith.
@ExtendWith(RandomParametersResolver.class)
public class RandomParametersTest {

    @Test
    void injectsInteger(@Random int i, @Random int j) {
    	System.out.println("random i = " + i + ", random j = " + j);
    }
    
    @Test
    void injectsDouble(@Random double d) {
    	System.out.println("random double = " + d);
    }

}