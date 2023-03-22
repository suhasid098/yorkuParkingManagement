package model;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import objects.User;

//Singleton pattern.
public class MaintainUser extends Maintain{
	public ArrayList<User> users = new ArrayList<User>();
	public User loggedInUser = null;
	
	private static final MaintainUser maintain = new MaintainUser();
	
	private MaintainUser() {
		this.path = this.path + "\\user.csv"; //Add your path here.
		try {
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static MaintainUser getInstance() {
		return maintain;
	}
	
	//Loads users in csv file to User ArrayList.
	@Override
	public void load() throws Exception{
		//Create a new reader for the csv file and read the file's headers.
		CsvReader reader = new CsvReader(this.path); 
		reader.readHeaders();
		
		//For each row, add a user to the User ArrayList using the data in each column as the attributes.
		while(reader.readRecord()){ 
			User user = new User();
			user.setName(reader.get("name"));
			user.setId(Integer.valueOf(reader.get("id")));
			user.setEmail(reader.get("email"));
			user.setPassword(reader.get("password"));
			user.setParkingSpot(reader.get("parking_spot"));
			user.setParkingLot(reader.get("lot"));
			user.setAccountType(reader.get("account_type"));
			user.setPaymentType(reader.get("payment_type"));
			user.setCardName(reader.get("name_on_card"));
			user.setCardNumber(reader.get("card_number"));
			user.setCvvNumber(reader.get("cvv_number"));
			user.setCreditBalance(reader.get("credit_balance"));
			user.setDebitBalance(reader.get("debit_balance"));
			if(reader.get("parking_startTime").equals("") || reader.get("parking_startTime").equals("null")) {
			} else {
				user.setParkingStartTime(LocalDateTime.parse(reader.get("parking_startTime")));
			}
			
			if(reader.get("parking_endTime").equals("") || reader.get("parking_endTime").equals("null")) {
			} else {
				user.setParkingEndTime(LocalDateTime.parse(reader.get("parking_endTime")));
			}
			user.setplateNumber(reader.get("license_plate_number"));
			users.add(user);
		}
	}
	
	//Add users in User ArrayList to csv file.
	@Override
	public void update() throws Exception{
		try {		
			
				//Create new csv file with appropriate headers at given path.
				CsvWriter csvOutput = new CsvWriter(new FileWriter(this.path, false), ',');
				csvOutput.write("name");
				csvOutput.write("id");
		    	csvOutput.write("email");
				csvOutput.write("password");
				csvOutput.write("parking_spot");
				csvOutput.write("lot");
				csvOutput.write("account_type");
				csvOutput.write("payment_type");
				csvOutput.write("name_on_card");
				csvOutput.write("card_number");
				csvOutput.write("cvv_number");
				csvOutput.write("credit_balance");
				csvOutput.write("debit_balance");
				csvOutput.write("parking_startTime");
				csvOutput.write("parking_endTime");
				csvOutput.write("license_plate_number");









				csvOutput.endRecord();

				//Add users in ArrayList to csv file.
				for(User u: users){
					csvOutput.write(u.getName());
					csvOutput.write(String.valueOf(u.getId()));
					csvOutput.write(u.getEmail());
					csvOutput.write(u.getPassword());
					csvOutput.write(u.getParkingSpotName());
					csvOutput.write(u.getLotName());
					csvOutput.write(u.getAccountType());
					csvOutput.write(u.getPaymentType());
					csvOutput.write(u.getCardName());
					csvOutput.write(u.getCardNumber());
					csvOutput.write(u.getCvvNumber());
					csvOutput.write(u.getCredittBalance());
					csvOutput.write(u.getDebitBalance());
//					System.out.println("Ptime2: "+ u.getParkingTime());
//					System.out.println("Ptime3: "+ String.valueOf(u.getParkingTime()));
					csvOutput.write(String.valueOf(u.getParkingStartTime()));
					csvOutput.write(String.valueOf(u.getParkingEndTime()));
					csvOutput.write(u.getPlateNumber());
					
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}


	
	 
}
