package password;

abstract class PasswordBuilder {
	protected Password password;
	
	public Password getPassword() {
		
		return password;
	}
	public void createNewPassword() {
	
		password = new Password();
		password.create();
		System.out.println("here");
	}	
	
	public abstract void setLength();
	public abstract void setIncludeNumbers();
	public abstract void setUpperCase();
	public abstract void setLowerCase();
	public abstract void setIncludeSymbols();

}
