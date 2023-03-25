package model;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import objects.User;

public class MaintainLot extends Maintain {
	public ArrayList<User> users = new ArrayList<User>();
	public String lotOptions = "Vanier,Bethune,Calumet,Schulich,Lassonde";

	private static final MaintainLot maintain = new MaintainLot();

	private MaintainLot() {
		this.path = this.path + "\\lot.csv"; // Add your path here.
		try {
			this.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static MaintainLot getInstance() {
		return maintain;
	}

	public void load() throws Exception {
		// Create a new reader for the csv file and read the file's headers.
		CsvReader reader = new CsvReader(this.path);
		reader.readHeaders();

		while (reader.readRecord()) {
			User user = new User();
			lotOptions = (reader.get("lots"));
		}
	}

	@Override
	public void update() throws Exception {
		try {

			// Create new csv file with appropriate headers at given path.
			CsvWriter csvOutput = new CsvWriter(new FileWriter(this.path, false), ',');
			csvOutput.write("lots");
			csvOutput.endRecord();

			csvOutput.write(lotOptions);

			csvOutput.endRecord();

			csvOutput.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
