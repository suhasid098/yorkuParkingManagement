package password;
//concrete builder
public class NumberPasswordBuilder extends PasswordBuilder {

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

	
}	  