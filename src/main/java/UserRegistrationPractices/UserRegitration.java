package UserRegistrationPractices;

import java.util.regex.Pattern;

public class UserRegitration {
	public boolean firstName() {
		boolean matchesString = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,10}$", "Rahul");
		return matchesString;
	}
}
