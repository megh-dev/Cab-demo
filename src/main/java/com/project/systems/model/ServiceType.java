package com.project.systems.model;

public enum ServiceType {
	
	GO("go"),PRIME("prime"),XL("xl");
	
	private String type;

	private ServiceType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
