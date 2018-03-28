package com.designpatterns.creational.factory;

public class FactoryDemoMain {
	public static void main(String[] args) {
		VehicleFactory carFactory = VehicleFactory.getVehicleFactory(VehicleType.CAR);

		Vehicle car = carFactory.rentVehicle(10_000);
		System.out.println(car.getModel() + ": " + car.start());

	}
}
