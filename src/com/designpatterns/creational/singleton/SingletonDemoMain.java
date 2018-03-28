package com.designpatterns.creational.singleton;

public class SingletonDemoMain {

	public static void main(String[] args) {

		// This will generate an error since the constructor is hidden.
		// AppProperties appProperty = new AppProperties();

		AppProperties appProperty1 = AppProperties.getInstance();

		String prop1 = appProperty1.get("AppName");
		String prop2 = appProperty1.get("Version");
		String nullProp = appProperty1.get("key");

		System.out.println("App Property Instance 1: " + appProperty1);
		System.out.println("Property 1: " + prop1);
		System.out.println("Property 2: " + prop2);
		System.out.println("Property does not exist: " + nullProp);

		AppProperties appProperty2 = AppProperties.getInstance();

		System.out.println("App Property Instance 2: " + appProperty2);

		System.out.println("App Property Instances are equal: " + (appProperty1 == appProperty2));

	}

}
