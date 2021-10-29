package UserRegistrationPractices;

import org.junit.Test;
import UserRegistration.UserRegistration;

public class UserRegistrationTest {
	private org.junit.Assert Assert;

	@Test
	public void givenFirstNameWhenShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean userTest = userRegistration.firstName();
		Assert.assertTrue(userTest);
	}
}