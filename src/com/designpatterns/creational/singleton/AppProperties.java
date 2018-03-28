package com.designpatterns.creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class AppProperties {

	// The volatile keyword ensures that multiple threads are checking
	// the same instance at the main memory (and not the cache memory).
	private static volatile AppProperties instance = null;

	private Map<String, String> propertyMap = new HashMap<>();

	private AppProperties() {
		// The null check means that the constructor was called outside of this class.
		// This can be done by doing reflection.
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create instance.");
		}
	}

	public static AppProperties getInstance() {
		if (instance == null) {
			synchronized (AppProperties.class) {
				// Second null check ensures that the instance is still null after
				// the lock to the class is made using the synchronized keyword.
				// This is called double-checked locking
				if (instance == null) {
					instance = new AppProperties();

					// Mock data source only. Data source could be retrieved from a file.
					instance.propertyMap.put("AppName", "DesignPatternsDemo");
					instance.propertyMap.put("Version", "1.0");
				}
			}
		}

		return instance;
	}

	public String get(String key) {
		return this.propertyMap.get(key);
	}
}
