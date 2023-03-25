package password;
// Director
public class Generator {
	private PasswordBuilder passwordBuilder;
	
	public void setPasswordBuilder(PasswordBuilder pb) {
		passwordBuilder = pb;
	}
	
	public Password getPassword() {
		return passwordBuilder.getPassword();
	}
	
	public void generatePassword() {
		passwordBuilder.createNewPassword();
		passwordBuilder.setUpperCase();
		passwordBuilder.setLowerCase();
		passwordBuilder.setIncludeSymbols();
		passwordBuilder.setLength();
	}
	

}
