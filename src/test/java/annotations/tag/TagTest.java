package annotations.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {

	@Test
	@Tag("Group1")
	void test1() {
		System.out.println("Testing 1");
	}
	
	@Test
	@Tag("Group2")
	void test2() {
		System.out.println("Testing 2");
	}
	
	@Test
	@Tag("Group1")
	@Tag("Group2")
	void test3() {
		System.out.println("Testing 3");
	}
	
	@Test
	@Tag("Group3")
	void test4() {
		System.out.println("Testing 4");
	}
	
	@Test
	@Tag("Group4")
	void test5() {
		System.out.println("Testing 5");
	}
	
}
