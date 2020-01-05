package annotations.test_factory_dynamic_tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainer2 {
	
	@TestFactory
	@DisplayName("Dynamic Test with Containers")
	Stream<DynamicNode> userAvailabilityDynamicTestWithContainers() {
		
		TestUsers utility = new TestUsers();
		
		return Stream.of("John", "Joan")
			.map(user -> DynamicContainer.dynamicContainer("User Container : " + user, Stream.of(
				DynamicTest.dynamicTest("Not Null", () -> assertNotNull(utility.getAllUsers())),
				DynamicTest.dynamicTest("Not Empty", () -> assertTrue(utility.getAllUsers().isEmpty())),
				DynamicContainer.dynamicContainer("Test Properties", Stream.of(
					DynamicTest.dynamicTest("Add User", () -> {
						   utility.addUser(user);
						   assertTrue(utility.getAllUsers().contains(user), "User will exist");
					}),
					DynamicTest.dynamicTest("Delete User", () -> {
						   utility.deleteUser(user);
						   assertFalse(utility.getAllUsers().contains(user), "User will not exist");
					})
				))
			)));
	} 
	
}
