package com.designpatterns.creational.simplefactory;

class Motorcycle implements Vehicle {

	@Override
	public String start() {
		return "Running at 70km per hour...";
	}

}
