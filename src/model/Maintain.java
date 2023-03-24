package model;

public abstract class Maintain {
	protected String path;
	
	public Maintain() {
		this.path = "C:\\Users\\Shaharyar\\Desktop\\Y3\\EECS3311Workspace\\eecs3311project"; //Change folder path here.
	}
	
	public abstract void load() throws Exception;
	public abstract void update() throws Exception;
}
