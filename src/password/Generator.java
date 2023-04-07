package password;

// Director
public class Generator {
	private PasswordBuilder passwordBuilder;

	public void setPasswordBuilder(PasswordBuilder pb) {
		passwordBuilder = pb;
	}

	public void generatePassword() {
		passwordBuilder.setUpperCase();
		passwordBuilder.setLowerCase();
		passwordBuilder.setIncludeSymbols();
		passwordBuilder.setLength();

	}

}
