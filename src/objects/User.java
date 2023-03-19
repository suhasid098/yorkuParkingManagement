package objects;

public class User {
	public String name;
	public int id;
	public String email;
	public String password;
//	public ParkingSpot spot;
	public String parkingSpotName;
	public String lotName;
	public String accountType;
	public double rate;

	public User(String name, int id, String email, String password, String accountType) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		this.parkingSpotName = "";
		this.lotName = "";
		this.accountType = accountType;
//		this.rate=getRate(accountType);

	}

	public void setParkingSpot(String s) {
		this.parkingSpotName = s;
	}

	public String getParkingSpotName() {
		return parkingSpotName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public User() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + ", accountType="
				+ accountType + "]";
	}

	public void setParkingLot(String lotName) {
		this.lotName = lotName;
	}

	public String getLotName() {
		return lotName;
	}

}
