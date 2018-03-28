package com.designpatterns.creational.factory;

abstract class VehicleFactory {

	public static VehicleFactory getVehicleFactory(VehicleType type) {
		switch (type) {
		case CAR:
			return new CarFactory();
		case MOTORCYCLE:
			return new MotorcycleFactory();
		default:
			return null;
		}
	}

	abstract Vehicle rentVehicle(int money);

}
