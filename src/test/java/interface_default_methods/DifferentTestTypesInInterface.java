package interface_default_methods;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// When no @TestInstance(TestInstance.Lifecycle.PER_CLASS) @BeforeAll and @AfterAll must be static method. 
public class DifferentTestTypesInInterface implements TestInterface3 {
    
	@Test
    void myTest() {
		System.out.println("@Test method from class");
    }
}

interface TestInterface3 {
    
    @Test
    default void test1() {
    	System.out.println("@Test method from interface");
    }
    
    @RepeatedTest(2)
    default void test2() {
    	System.out.println("@RepeatedTest method from interface");
    }
    
    @ParameterizedTest
    @ValueSource(ints = {1,2})
    default void test3(int param) {
    	System.out.println("@ParameterizedTest method from interface - " + param);
    }
}