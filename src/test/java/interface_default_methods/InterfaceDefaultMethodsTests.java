package interface_default_methods;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

// When @TestInstance(TestInstance.Lifecycle.PER_CLASS) no need to declare @BeforeAll and @AfterAll as static 
public class InterfaceDefaultMethodsTests implements TestInterface1 {
    
	@Test
    void myTest() {
		System.out.println("@Test method from class");
    }
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
interface TestInterface1 {
    @BeforeAll
    default void initAll() {
        System.out.println("@BeforeAll runs once before all tests");
    }
    @BeforeEach
    default void init() {
        System.out.println("@BeforeEach runs before each test");
    }
    @AfterAll
    default void tearDownAll() {
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