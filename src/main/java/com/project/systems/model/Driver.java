package com.project.systems.model;

public class Driver extends User{
	
	private String drivingLicenceNumber;
	
	private String vehicleNumber;

	public Driver() {
		super();
	}

	public Driver(String userId, String name, String contactDetails,String drivingLicenceNumber, String vehicleNumber) {
		super(userId, name, contactDetails);
		this.drivingLicenceNumber = drivingLicenceNumber;
		this.vehicleNumber = vehicleNumber;
	}

	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}

	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
}
