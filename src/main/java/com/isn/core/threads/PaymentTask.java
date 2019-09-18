package com.isn.core.threads;

import java.util.concurrent.Callable;

public class PaymentTask implements Callable<PaymentResponse> {
	
	String cardnumber;
	
	public PaymentTask() {
		
	}
	
	public PaymentTask(String cardnumber) {
		this.cardnumber=cardnumber;
	}

	@Override
	public PaymentResponse call() throws Exception {
		
		//payment processing n done
		System.out.println(cardnumber);
		return new PaymentResponse("200");
	}

}
