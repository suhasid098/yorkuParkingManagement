package objects;

public class ParkingSpot {
	public String code;
	private Sensor sensor;
	
	public ParkingSpot(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
}
