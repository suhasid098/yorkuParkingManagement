package views;

public class AlertStateContext {
	// Here I am using the State Design Pattern
	
	private Alert currentState;

	public AlertStateContext() {
		currentState = new Available(); 
	}
	
	public void setState(Alert state) {
		currentState = state;
	}

	public String alert() {
		return currentState.alert(this);
	}
}
