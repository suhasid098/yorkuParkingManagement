package password;

import java.security.SecureRandom;
import java.util.Random;

// Director
public class Generator {
	private PasswordBuilder passwordBuilder;

	public void setPasswordBuilder(PasswordBuilder pb) {
		passwordBuilder = pb;
	}

//	public String getPassword() {
//		Password p = passwordBuilder.getPassword();
//
//		Random random = new SecureRandom();
//		StringBuilder sb = new StringBuilder();
//		String numbers = "1234567890";
//		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String lowercase = "abcdefghijklmnopqrstuvwxyz";
//		String symbols = "!@#$%^&*()_+-={}[]|\\\\:;\\\"',.?/";
//		String validChars = lowercase;
//
//		if (p.getincludeUpperCase()) {
//			validChars += uppercase;
//		}
//		if (p.getIncludeNumbers()) {
//			validChars += numbers;
//		}
//		if (p.getSymbols()) {
//			validChars += symbols;
//		}
//
//		for (int i = 0; i < p.getLength(); i++) {
//			int index = random.nextInt(validChars.length());
//			char c = validChars.charAt(index);
//			sb.append(c);
//		}
//		return sb.toString();

//	}

	public void generatePassword() {
//		passwordBuilder.createNewPassword();
		passwordBuilder.setUpperCase();
		passwordBuilder.setLowerCase();
		passwordBuilder.setIncludeSymbols();
		passwordBuilder.setLength();

	}

}
