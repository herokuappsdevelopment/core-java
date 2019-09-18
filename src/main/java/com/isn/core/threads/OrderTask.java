package com.isn.core.threads;

import java.util.concurrent.Callable;

public class OrderTask implements Callable<OrderResponse> {
	
	String paymentId;
	
	public OrderTask(String paymentId) {
		this.paymentId=paymentId;
	}

	@Override
	public OrderResponse call() throws Exception {
		
		return new OrderResponse("12345");
	}

}
