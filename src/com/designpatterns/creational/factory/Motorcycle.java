package com.designpatterns.creational.factory;

class Motorcycle extends Vehicle {

	public Motorcycle(String model) {
		super(model);
	}

	@Override
	String start() {
		return "Running at 70km per hour...";
	}
}
