package password;

import java.security.SecureRandom;
import java.util.Random;

//concrete builder
public class NumberPasswordBuilder implements PasswordBuilder {
	private Password password = new Password();;

	@Override
	public void setLength() {
		password.setLength(4);
	}

	@Override
	public void setIncludeNumbers() {
		password.addNumbers(true);
	}

	@Override
	public void setIncludeSymbols() {
		password.addSymbols(false);
	}

	@Override
	public void setUpperCase() {
		password.addUpperCase(false);
	}

	@Override
	public void setLowerCase() {
		password.addLowerCase(false);
	}

	public Password getPassword() {

		Random random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		String numbers = "1234567890";
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String symbols = "!@#$%^&*()_+-={}[]|\\\\:;\\\"',.?/";
		String validChars = lowercase;

		if (password.getincludeUpperCase()) {
			validChars += uppercase;
		}
		if (password.getIncludeNumbers()) {
			validChars += numbers;
		}
		if (password.getSymbols()) {
			validChars += symbols;
		}

		for (int i = 0; i < password.getLength(); i++) {
			int index = random.nextInt(validChars.length());
			char c = validChars.charAt(index);
			sb.append(c);
		}
		password.setPassword1(sb.toString());

		return password;
	}

}