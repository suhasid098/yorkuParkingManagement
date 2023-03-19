package objects;

public class User {
	public String name;
	public int id;
	public String email;
	public String password;
	public String parkingSpotName;
	public String lotName;
	public String accountType;
	public double rate;
	public String cardName;
	public String cardNumber;
	public String cvvNumber;

	public User(String name, int id, String email, String password, String accountType) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.password = password;
		this.parkingSpotName = "";
		this.lotName = "";
		this.accountType = accountType;
		this.rate = getRate();

	}

	public double getRate() {
		System.out.println("ACCOUNT TYPE:" + accountType);
		// TODO Auto-generated method stub
		if (accountType.equals("Faculty")) {
			rate = 8.00;

		} else if (accountType.equals("Non-Faculty")) {
			rate = 10.00;
		} else if (accountType.equals("Student")) {
			rate = 5.00;
		} else if (accountType.equals("Visitor")) {
			rate = 15.00;
		}
		System.out.println("Rate TYPE:" + rate);
		return rate;
	}

	public void setCardName(String cName) {
		this.cardName = cName;
	}

	public String getCardName() {
		return cardName;

	}

	public void setCardNumber(String cNum) {
		this.cardNumber = cNum;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCvvNumber(String cvvNum) {
		this.cvvNumber = cvvNum;
	}

	public String getCvvNumber() {
		return cvvNumber;
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