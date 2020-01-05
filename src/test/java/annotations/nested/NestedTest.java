package annotations.nested;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {
	
	@Test
	void test() {
		System.out.println("Outer Class Test");
	}
	
	@Nested
	class InnerClass {
		
		@Test
		void test() {
			System.out.println("Inner Class Test");
		}
	}
}
