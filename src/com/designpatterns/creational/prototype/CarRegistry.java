package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CarRegistry {

	private static Map<String, Car> registry = null;

	public CarRegistry() {
		if (registry == null) {
			registry = new HashMap<>();
			loadPrototypes();
		}
	}

	private void loadPrototypes() {
		Car hyundai = new Car();

		// This shows that a car instance is difficult to create.
		// We will create a prototype and save it to the registry.
		hyundai.setBrand("Hyundai");
		hyundai.setBodyType("Crossover");
		hyundai.setPrice(1_158_000);
		hyundai.setTransmissionType("Manual");
		hyundai.setEngineSize(2);
		hyundai.setDisplacement(1_999);
		hyundai.setCylinderCount(4);
		hyundai.setValveCount(16);
		hyundai.setTransmissionCategory("6-Speed Manual Transmission");
		hyundai.setPowerTrain("Front-Wheel Drive");
		hyundai.setMaxOutput(155);
		hyundai.setMaxOutputRpm(6_200);
		hyundai.setMaxTorque(192);
		hyundai.setMaxTorqueRpm(4_000);
		hyundai.setFuelType("Gasoline");
		hyundai.setFuelCapacity(62);
		hyundai.setLength(4_475);
		hyundai.setWidth(1_850);
		hyundai.setHeight(1_660);
		hyundai.setWheelbase(2_670);
		hyundai.setGroundClearance(172);
		hyundai.setDoorCount(5);
		hyundai.setSeatCount(5);
		hyundai.setHasDriverAirbag(true);
		hyundai.setHasElectronicDoorLock(true);

		registry.put("HYUNDAI", hyundai);

	}

	public Car getCarPrototype(String key) {
		Car car = null;

		if (registry.containsKey(key)) {

			try {
				// Clone the prototype and you can now use it as base object.
				car = registry.get(key).clone();
			} catch (CloneNotSupportedException e) {
				System.err.println("Unable to clone car prototype.");
			}
		}

		return car;
	}

}
