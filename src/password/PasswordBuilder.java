package password;

public interface PasswordBuilder {
//	Password password;

//	public Password getPassword() {
//
//		return password;
//	}

//	public void createNewPassword() {
//		password = new Password();
//	}

	public abstract void setLength();

	public abstract void setIncludeNumbers();

	public abstract void setUpperCase();

	public abstract void setLowerCase();

	public abstract void setIncludeSymbols();
	

}
