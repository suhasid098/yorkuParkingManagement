package views;

// Here I am using the State Design Pattern
public class Unavailable implements Alert {

	@Override
	public String alert(AlertStateContext c) {
		return "Unavailable";
	}

}
