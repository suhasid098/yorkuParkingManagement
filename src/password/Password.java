package password;

public class Password {
	private int length;
	private boolean includeUpperCase;
	private boolean includeLowerCase;
	private boolean includeNumbers;
	private boolean includeSymbols;
	private String password1;

	public void setLength(int size) {
		this.length = size;
	}

	public void addNumbers(boolean includeNumbers) {
		this.includeNumbers = includeNumbers;
	}

	public void addUpperCase(boolean includeUpperCase) {
		this.includeUpperCase = includeUpperCase;
	}

	public void addLowerCase(boolean includeLowerCase) {
		this.includeLowerCase = includeLowerCase;
	}

	public void addSymbols(boolean includeNumbers) {
		this.includeSymbols = includeNumbers;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public boolean getincludeLowerCase() {
		return this.includeLowerCase;
	}

	public boolean getincludeUpperCase() {
		return this.includeUpperCase;
	}

	public boolean getIncludeNumbers() {
		return this.includeNumbers;
	}

	public boolean getSymbols() {
		return this.includeSymbols;
	}

	public int getLength() {
		return this.length;
	}

}
