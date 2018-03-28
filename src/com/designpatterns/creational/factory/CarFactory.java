package com.designpatterns.creational.factory;

class CarFactory extends VehicleFactory {

	@Override
	Vehicle rentVehicle(int money) {
		if (money > 50_000) {
			return new Car("Ferrari");
		} else {
			return new Car("Toyota");
		}
	}

}
