package com.designpatterns.creational.prototype;

public class PrototypeDemoMain {
	public static void main(String[] args) {
		CarRegistry carRegistry = new CarRegistry();
		Car hyundaiCar = carRegistry.getCarPrototype("HYUNDAI");
		int originalPrice = hyundaiCar.getPrice();
		hyundaiCar.setPrice(1_000_000);
		
		System.out.println("Hyundai Car Prototype: ");
		System.out.println("Brand Name: " + hyundaiCar.getBrand());
		System.out.println("Original Price: " + originalPrice);
		System.out.println("Sale Price: " + hyundaiCar.getPrice());
	}
}
