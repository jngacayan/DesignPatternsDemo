package com.designpatterns.creational.simplefactory;

public class SimpleFactoryDemoMain {
	public static void main(String[] args) {
		Vehicle car = VehicleFactory.rentVehicle(VehicleType.CAR);
		System.out.println(car.start());

		Vehicle bike = VehicleFactory.rentVehicle(VehicleType.BICYCLE);
		System.out.println(bike.start());
	}
}
