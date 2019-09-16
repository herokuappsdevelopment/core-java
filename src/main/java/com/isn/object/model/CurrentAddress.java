package com.isn.object.model;

public class CurrentAddress extends Address {
	
	String province;
	String postalCode;
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String address() {		
		return "C R " +addressType;
	}
	
	

}
