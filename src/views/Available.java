package views;

public class Available implements Alert {
	// Here I am using the State Design Pattern

	@Override
	public String alert(AlertStateContext c) {
		return "Available";
	}

}
