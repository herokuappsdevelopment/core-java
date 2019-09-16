package com.isn.object.model;

public abstract class Address {
	
	String addressLine1;
	String addressLine2;
	
	String addressType;
	
	
	public String getAddressLine1() {
		return addressLine1;
	}



	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}



	public String getAddressLine2() {
		return addressLine2;
	}



	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressType() {
		return addressType;
	}



	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String address() {
		return "Base Address : "+ this.addressType;
	}
	

}
