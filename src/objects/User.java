package objects;

import java.time.LocalDateTime;

public class User extends Account{
	public String email;
	public String parkingSpotName;
	public String lotName;
	public String accountType;
	boolean approved;
	public double rate;
	public String cardName;
	public String cardNumber;
	public String cvvNumber;
	public String paymentType;
	public int debitBalance = 1000; // preset to $1000 (user has $1000)
	public int creditBalnce = 0; // used $0 of credit card at the start
	public LocalDateTime parkingStartTime;
	public LocalDateTime parkingEndTime;
	public String plateNumber;
	public int price;

	
	// could create a parking object with start date, end date, lotname,parkingspotname
	// assume there is no credit limit
	public int parkingFee = 0;
	public User(String name, int id, String email, String password, String accountType) {
		super(name, id, password);
		this.email = email;
		this.parkingSpotName = "";
		this.lotName = "";
		this.accountType = accountType;
		if(this.accountType.equals("Visitor")) {
			approved = true;
		}else {
			approved = false;
		}
		this.rate = getRate();
	}
	
	public User() {
	}
	
	//updating balance of either credit or debit card
	public void chargeUser(String payementType, int parkingfee) {
		this.paymentType = payementType;
		parkingFee = parkingfee;
		if(payementType.equalsIgnoreCase("credit")) {
			creditBalnce = creditBalnce + parkingfee;
		} else if(payementType.equalsIgnoreCase("debit")) {
			debitBalance = debitBalance - parkingfee;
		}
	}
	
	public void setCreditBalance(String balance) {
		if(balance.equals("")) {
			this.creditBalnce = 0;
		}
		this.creditBalnce = Integer.parseInt(balance);
	}
	public void setDebitBalance(String balance) {
		if(balance.equals("")) {
			this.debitBalance = 1000;
		}
		this.debitBalance = Integer.parseInt(balance);
	}


	public void refund(int balance) {
		if(this.paymentType.equals("Credit")) {
			this.creditBalnce = this.creditBalnce - balance;
		}else {
			this.debitBalance = this.debitBalance + balance;

		}
	}

	public void setPaymentType(String paymentType1) {
		this.paymentType = paymentType1;
	}
	public String getPaymentType() {
		return this.paymentType;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean getApproved() {
		return this.approved;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}


	public void setParkingLot(String lotName) {
		this.lotName = lotName;
	}

	public String getLotName() {
		return lotName;
	}

	public String getDebitBalance() {
		// TODO Auto-generated method stub
		return this.debitBalance + "";
	}
	public String getCredittBalance() {
		// TODO Auto-generated method stub
		return this.creditBalnce + "";
	}


	public void setParkingStartTime(LocalDateTime startTime) {
		this.parkingStartTime = startTime;
	}
	public void setParkingEndTime(LocalDateTime endTime) {
		this.parkingEndTime = endTime;
	}
	public LocalDateTime getParkingStartTime() {
		return this.parkingStartTime;
	}
	public LocalDateTime getParkingEndTime() {
		return this.parkingEndTime;
	}


	public void setplateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPrice(int price) {
		this.price = price;		
	}
	public void addPrice(int addedPrice) {
		this.price = this.price + addedPrice;
	}
	public int getPrice() {
		return this.price;
	}
	
	
}