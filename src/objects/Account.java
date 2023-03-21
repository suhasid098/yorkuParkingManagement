package objects;

public abstract class Account {
	protected String name;
	protected int id;
	protected String password;
	
	Account(){		
	}
	
	public Account(String name, int id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}