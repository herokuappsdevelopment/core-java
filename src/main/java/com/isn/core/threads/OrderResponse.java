package com.isn.core.threads;

public class OrderResponse {
	
	String orderId;
	
	public OrderResponse(String id) {
		this.orderId=id;
	}

	public final String getOrderId() {
		return orderId;
	}

	public final void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	
	

}
