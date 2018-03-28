package com.designpatterns.creational.factory;

class Car extends Vehicle {

	public Car(String model) {
		super(model);
	}

	@Override
	String start() {
		return "Running at 50km per hour...";
	}
}
