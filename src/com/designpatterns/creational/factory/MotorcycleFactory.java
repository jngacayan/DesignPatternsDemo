package com.designpatterns.creational.factory;

public class MotorcycleFactory extends VehicleFactory {

	@Override
	Vehicle rentVehicle(int money) {
		if (money > 50_000) {
			return new Motorcycle("Harley");
		} else {
			return new Car("Yamaha");
		}
	}
}
