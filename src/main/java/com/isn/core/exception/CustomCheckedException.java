package com.isn.core.exception;

public class CustomCheckedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomCheckedException() {
		super();
	}
	
	public CustomCheckedException(String message) {
		super(message);
	}
	
	public CustomCheckedException(String message,Throwable t) {
		super(message,t);
	}
	public CustomCheckedException(Throwable t) {
		super(t);
	}

}
