package com.project.systems.model;

import java.math.BigDecimal;

public class Trip {
	
	private String tripId;
	
	private LocationPoint sourceLocationPoint;
	
	private LocationPoint destinationLocationPoint;
	
	private BigDecimal distanceToTravel;
	
	private BigDecimal tripDuration;
	
	private TripType tripType;
	
	private ServiceType serviceType;
	
	private String passengerId;
	
	private String driverId;
	
	private BigDecimal dropCharges;
	
	private BigDecimal cancellationCharges;
	
	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public LocationPoint getSourceLocationPoint() {
		return sourceLocationPoint;
	}

	public void setSourceLocationPoint(LocationPoint sourceLocationPoint) {
		this.sourceLocationPoint = sourceLocationPoint;
	}

	public LocationPoint getDestinationLocationPoint() {
		return destinationLocationPoint;
	}

	public void setDestinationLocationPoint(LocationPoint destinationLocationPoint) {
		this.destinationLocationPoint = destinationLocationPoint;
	}

	public BigDecimal getDistanceToTravel() {
		return distanceToTravel;
	}

	public void setDistanceToTravel(BigDecimal distanceToTravel) {
		this.distanceToTravel = distanceToTravel;
	}

	public BigDecimal getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(BigDecimal tripDuration) {
		this.tripDuration = tripDuration;
	}

	public TripType getTripType() {
		return tripType;
	}

	public void setTripType(TripType tripType) {
		this.tripType = tripType;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public String getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public BigDecimal getDropCharges() {
		return dropCharges;
	}

	public void setDropCharges(BigDecimal dropCharges) {
		this.dropCharges = dropCharges;
	}

	public BigDecimal getCancellationCharges() {
		return cancellationCharges;
	}

	public void setCancellationCharges(BigDecimal cancellationCharges) {
		this.cancellationCharges = cancellationCharges;
	}
	
	
	
	

}
