package com.designpatterns.creational.simplefactory;

class VehicleFactory {

	public static Vehicle rentVehicle(VehicleType type) {
		switch (type) {
			case CAR:
				return new Car();
			case MOTORCYCLE:
				return new Motorcycle();
			case BICYCLE:
				return new Bicycle();
			default:
				return null;
		}
	}
}
