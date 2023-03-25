package password;
import java.security.SecureRandom;
import java.util.Random;
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
	public void addNumbers(boolean includeUppercase) {
		this.includeNumbers = includeUppercase;
	}
	public void addUpperCase(boolean includeUpperCase) {
		this.includeUpperCase =includeUpperCase;
	}
	public void addLowerCase(boolean includeLowerCase) {
		this.includeLowerCase =includeLowerCase;
	}
	public void addSymbols(boolean includeNumbers) {
		this.includeSymbols =includeNumbers;
	}
	public void create() {
        Random random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        String numbers = "1234567890";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String symbols = "!@#$%^&*()_+-={}[]|\\\\:;\\\"',.?/";
        
        String validChars = lowercase;
        if (includeUpperCase) {
            validChars += uppercase;
        }
        if (includeNumbers) {
            validChars += numbers;
        }
        if (includeSymbols) {
            validChars += symbols;
        }
//   	 Aa!1
		for (int i = 0; i < length; i++) {
            int index = random.nextInt(validChars.length());
            char c = validChars.charAt(index);
            sb.append(c);
    		System.out.println(c);
    		System.out.println("hi");

        }
		System.out.println("hiii: "+sb.toString());
		setPassword1(sb.toString());
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	
	 
	 

}
