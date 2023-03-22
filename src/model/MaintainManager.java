package model;

import java.io.FileWriter;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import objects.Manager;
import objects.SuperManager;

//Singleton pattern.
public class MaintainManager extends Maintain {
	public ArrayList<Manager> managers = new ArrayList<Manager>();
	public Manager loggedInManager = null;
	
	private static final MaintainManager maintain = new MaintainManager();
	
	private MaintainManager() {
		this.path = this.path + "\\manager.csv";

		try {
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static MaintainManager getInstance() {
		return maintain;
	}
	
	//Loads managers in csv file to User ArrayList.
	@Override
	public void load() throws Exception{
		//Create a new reader for the csv file and read the file's headers.
		CsvReader reader = new CsvReader(this.path); 
		reader.readHeaders();
		
		//For each row, add a manager to the Manager ArrayList using the data in each column as the attributes.
		while(reader.readRecord()){ 
			int id = Integer.valueOf(reader.get("id"));
			Manager manager;
			if(id == 0) {
				manager = new SuperManager();
			} else {
				manager = new Manager();
			}
			manager.setName(reader.get("name"));
			manager.setId(id);
			manager.setPassword(reader.get("password"));
			managers.add(manager);
		}
	}
	
	//Add managers in Manager ArrayList to csv file.
	@Override
	public void update() throws Exception{
		try {		
			
				//Create new csv file with appropriate headers at given path.
				CsvWriter csvOutput = new CsvWriter(new FileWriter(this.path, false), ',');
				csvOutput.write("name");
				csvOutput.write("id");
				csvOutput.write("password");

				csvOutput.endRecord();

				//Add managers in ArrayList to csv file.
				for(Manager m: managers){
					csvOutput.write(m.getName());
					csvOutput.write(String.valueOf(m.getId()));
					csvOutput.write(m.getPassword());

					csvOutput.endRecord();
				}
				csvOutput.close();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	}
}
