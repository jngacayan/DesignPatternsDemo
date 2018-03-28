package com.designpatterns.creational.prototype;

public class Car implements Cloneable {

	// Sample object has a lot of properties.
	// Some of them may be common to all car instances.
	private String brand;
	private String bodyType;
	private int price;
	private String transmissionType;
	private double engineSize;
	private int displacement;
	private int cylinderCount;
	private int valveCount;
	private String transmissionCategory;
	private String powerTrain;
	private int maxOutput;
	private int maxOutputRpm;
	private int maxTorque;
	private int maxTorqueRpm;
	private String fuelType;
	private double fuelCapacity;
	private int length;
	private int width;
	private int height;
	private int wheelbase;
	private int groundClearance;
	private int doorCount;
	private int seatCount;
	private boolean hasElectronicDoorLock;
	private boolean hasDriverAirbag;

	@Override
	protected Car clone() throws CloneNotSupportedException {
		// You can create your custom implementation of the clone function.
		// You can make a deep or shallow clone/copy of the original object.
		return (Car) super.clone();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	public int getCylinderCount() {
		return cylinderCount;
	}

	public void setCylinderCount(int cylinderCount) {
		this.cylinderCount = cylinderCount;
	}

	public int getValveCount() {
		return valveCount;
	}

	public void setValveCount(int valveCount) {
		this.valveCount = valveCount;
	}

	public String getTransmissionCategory() {
		return transmissionCategory;
	}

	public void setTransmissionCategory(String transmissionCategory) {
		this.transmissionCategory = transmissionCategory;
	}

	public String getPowerTrain() {
		return powerTrain;
	}

	public void setPowerTrain(String powerTrain) {
		this.powerTrain = powerTrain;
	}

	public int getMaxOutput() {
		return maxOutput;
	}

	public void setMaxOutput(int maxOutput) {
		this.maxOutput = maxOutput;
	}

	public int getMaxOutputRpm() {
		return maxOutputRpm;
	}

	public void setMaxOutputRpm(int maxOutputRpm) {
		this.maxOutputRpm = maxOutputRpm;
	}

	public int getMaxTorque() {
		return maxTorque;
	}

	public void setMaxTorque(int maxTorque) {
		this.maxTorque = maxTorque;
	}

	public int getMaxTorqueRpm() {
		return maxTorqueRpm;
	}

	public void setMaxTorqueRpm(int maxTorqueRpm) {
		this.maxTorqueRpm = maxTorqueRpm;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWheelbase() {
		return wheelbase;
	}

	public void setWheelbase(int wheelbase) {
		this.wheelbase = wheelbase;
	}

	public int getGroundClearance() {
		return groundClearance;
	}

	public void setGroundClearance(int groundClearance) {
		this.groundClearance = groundClearance;
	}

	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public boolean isHasElectronicDoorLock() {
		return hasElectronicDoorLock;
	}

	public void setHasElectronicDoorLock(boolean hasElectronicDoorLock) {
		this.hasElectronicDoorLock = hasElectronicDoorLock;
	}

	public boolean isHasDriverAirbag() {
		return hasDriverAirbag;
	}

	public void setHasDriverAirbag(boolean hasDriverAirbag) {
		this.hasDriverAirbag = hasDriverAirbag;
	}

}
