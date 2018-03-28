package com.designpatterns.creational.simplefactory;

class Bicycle implements Vehicle {

	@Override
	public String start() {
		return "Running at 30km per hour...";
	}

}
