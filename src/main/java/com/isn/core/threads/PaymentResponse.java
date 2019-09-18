package com.isn.core.threads;

public class PaymentResponse {
	
	String status;
	
	public PaymentResponse(String status){this.status=status;}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}
