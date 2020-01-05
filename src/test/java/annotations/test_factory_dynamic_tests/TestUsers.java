package annotations.test_factory_dynamic_tests;

import java.util.ArrayList;
import java.util.List;

public class TestUsers {

	List<String> allUsers = new ArrayList<>();

	public List<String> getAllUsers() {
		return allUsers;
	}

	public void addUser(String user) {
		allUsers.add(user);
	}

	public void deleteUser(String user) {
		allUsers.remove(user);
	}
	
}