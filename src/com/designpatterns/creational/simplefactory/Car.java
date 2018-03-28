package com.designpatterns.creational.simplefactory;

class Car implements Vehicle {

	@Override
	public String start() {
		return "Running at 50km per hour...";
	}

}
