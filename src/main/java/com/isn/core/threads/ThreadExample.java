package com.isn.core.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
				
		//System.out.println(Thread.currentThread().getName());
		
		
		Runnable r1 = () -> {
			//payment processing
			processing();
			System.out.println("Sys");
			
		};
		
		Runnable r2 = () -> {
			//payment processing
			processing();
			System.out.println("Sys");
			
		};
		
		synchronized(r1){
			
		}
		
		Thread t1 = new Thread(r1);		
		//t1.start();
				
		ExecuteTask2 task2 = new ExecuteTask2();
		//task2.start();
		
		
		PaymentTask paymentTask = new PaymentTask("123456");
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<PaymentResponse> futureRespose = executorService.submit(paymentTask);
		
		if(futureRespose.isDone()) {
			PaymentResponse paymentResponse = futureRespose.get();
			
			if (paymentResponse.getStatus().equals("200")) {
				//order task execution
			} else {
				//payment failed
			}
			
			System.out.println("Payment resonse : "+paymentResponse.getStatus());
			
			
		}
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		scheduledExecutorService.scheduleAtFixedRate(r1, 1, 10, TimeUnit.SECONDS);
		
	}
	
	
	
	private static synchronized void processing() {
		
	}

}
