package model;

public abstract class Maintain {
	protected String path;
	
	public Maintain() {
		this.path = "C:\\Users\\suhas\\Downloads\\EECS 3311\\FinalProjectEECS3311\\eecs3311project"; //Change folder path here.
	}
	
	public abstract void load() throws Exception;
	public abstract void update() throws Exception;
}
