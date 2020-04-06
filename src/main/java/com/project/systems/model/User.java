package com.project.systems.model;

public class User {
	
	private String userId;
	
	private String name;
	
	private String contactDetails;
	
	public User() {
		super();
	}

	public User(String userId, String name, String contactDetails) {
		super();
		this.userId = userId;
		this.name = name;
		this.contactDetails = contactDetails;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

}
