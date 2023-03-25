package objects;

import java.util.Random;

public class Sensor {

	// simulation for car type
	// picks a random Car Type for each user
	public class RandCarType {
		public String[] items = new String[] { "Sedan", "SUV", "Pick-up", "Minivan" };
		public Random rand = new Random();

		public String getRandArrayElement() {
			return items[rand.nextInt(items.length)];
		}
	}

	// picks a random CarModel for each user
	public class RandCarModel {
		public String[] items = new String[] { "Nissan", "KIA", "BMW", "Mercedes", "Honda", "Hyundai" };
		public Random rand = new Random();

		public String getRandArrayElement() {
			return items[rand.nextInt(items.length)];
		}
	}
}
