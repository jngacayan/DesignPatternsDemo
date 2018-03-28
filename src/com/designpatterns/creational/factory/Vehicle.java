package com.designpatterns.creational.factory;

abstract class Vehicle {

	private String model;

	public Vehicle(String model) {
		this.model = model;
	}

	abstract String start();

	public String getModel() {
		return model;
	}

}
