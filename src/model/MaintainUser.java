package model;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import objects.User;

//Singleton pattern.
public class MaintainUser {
	public ArrayList<User> users = new ArrayList<User>();
	public String path;
	
	private static final MaintainUser maintain = new MaintainUser();
	
	public static void main(String [] args) throws Exception{
		//hello
		String path = "C:\\Users\\natal\\eecs3311project\\user.csv"; //Add your path here to test.
		MaintainUser maintain = MaintainUser.getInstance();
	
		//Load users in csv file to User ArrayList.
		maintain.load(path);
		
		//Display users.
		for(User u: maintain.users){
			System.out.println(u.toString());
		}
		
		//Add user example.
		User newUser = new User("t4", 4, "t4@yorku.ca", "t4t4");
		maintain.users.add(newUser);
		
		//Update csv file DB.
		maintain.update(path);
	}
	
	private MaintainUser() {
		this.path = "C:\\Users\\natal\\eecs3311project\\user.csv"; //Add your path here.
		try {
			this.load(this.path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static MaintainUser getInstance() {
		return maintain;
	}
	
	//Loads users in csv file to User ArrayList.
	public void load(String path) throws Exception{
		//Create a new reader for the csv file and read the file's headers.
		CsvReader reader = new CsvReader(path); 
		reader.readHeaders();
		
		//For each row, add a user to the User ArrayList using the data in each column as the attributes.
		while(reader.readRecord()){ 
			User user = new User();
			user.setName(reader.get("name"));
			user.setId(Integer.valueOf(reader.get("id")));
			user.setEmail(reader.get("email"));
			user.setPassword(reader.get("password"));
			users.add(user);
		}
	}
	
	//Add users in User ArrayList to csv file.
	public void update(String path) throws Exception{
		try {		
			
				//Create new csv file with appropriate headers at given path.
				CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');
				csvOutput.write("name");
				csvOutput.write("id");
		    	csvOutput.write("email");
				csvOutput.write("password");
				csvOutput.endRecord();

				//Add users in ArrayList to csv file.
				for(User u: users){
					csvOutput.write(u.getName());
					csvOutput.write(String.valueOf(u.getId()));
					csvOutput.write(u.getEmail());
					csvOutput.write(u.getPassword());
					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
