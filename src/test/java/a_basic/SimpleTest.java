package a_basic;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTest {

	@BeforeAll
	public static void init() {
	}
	@AfterAll
	public static void clean() {
	}
	
	
	@BeforeEach
	public void beforeEach() {
	}
	@AfterEach
	public void afterEach() {
	}
	
	
	@Test
	public void test() {
		assertThat(2 + 1, is(3));
	}
	
}
