package password;

//concrete builder
public class StrongPasswordBuilder extends PasswordBuilder {

	@Override
	public void setLength() {
		password.setLength(8);
	}

	@Override
	public void setIncludeNumbers() {
		password.addNumbers(true);
	}

	@Override
	public void setIncludeSymbols() {
		password.addSymbols(true);
	}

	@Override
	public void setUpperCase() {
		password.addUpperCase(true);
	}

	@Override
	public void setLowerCase() {
		password.addLowerCase(true);
	}

}