package objects;

import java.util.Random;

public class Sensor {

	// simulation for car type
	// picks a random Car Type for each user

	public String[] carType = new String[] { "Sedan", "SUV", "Pick-up", "Minivan" };
	public Random rand1 = new Random();

	public String getRandArrayElement1() {
		return carType[rand1.nextInt(carType.length)];
	}

	// picks a random CarModel for each user

	public String[] carModel = new String[] { "Nissan", "KIA", "BMW", "Mercedes", "Honda", "Hyundai" };
	public Random rand2 = new Random();

	public String getRandArrayElement2() {
		return carModel[rand2.nextInt(carModel.length)];

	}
}
