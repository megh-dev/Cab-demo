package com.project.systems.model;

public class Vehicle {
	
	private String vehicleNumber;
	
	private String manufacturer;
	
	private String model;
	
	private String engineNumber;
	
	private ServiceType serviceType;

	public Vehicle() {
		super();
	}

	public Vehicle(String vehicleNumber, String manufacturer, String model, String engineNumber,
			ServiceType serviceType) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.manufacturer = manufacturer;
		this.model = model;
		this.engineNumber = engineNumber;
		this.serviceType = serviceType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	

}
