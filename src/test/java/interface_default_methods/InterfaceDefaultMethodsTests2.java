package interface_default_methods;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// When no @TestInstance(TestInstance.Lifecycle.PER_CLASS) @BeforeAll and @AfterAll must be static method. 
public class InterfaceDefaultMethodsTests2 implements TestInterface2 {
    
	@Test
    void myTest() {
		System.out.println("@Test method from class");
    }
}

interface TestInterface2 {
    @BeforeAll
    static void initAll() {
        System.out.println("@BeforeAll runs once before all tests");
    }
    @BeforeEach
    default void init() {
        System.out.println("@BeforeEach runs before each test");
    }
    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll runs once after all tests");
    }
    @AfterEach
    default void tearDown() {
        System.out.println("@AfterEach runs after each test");
    }
    @Test
    default void test() {
    	System.out.println("@Test method from interface");
    }
}