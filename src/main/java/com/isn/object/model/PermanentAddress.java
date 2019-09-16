package com.isn.object.model;

public class PermanentAddress extends Address {
	
	String areaCode;
	String zipCode;
	
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String address() {		
		return "P R "+addressType;
	}
	

}
