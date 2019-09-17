package com.isn.core.exception;

import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		try{
			
			String name = null;
			sayHello(name);
			
		} catch (CustomCheckedException | IOException e) {
			
			e.printStackTrace();
		}
		
		String time=null;
		System.out.println(ping(time));
		
	}
	
	public static String sayHello(String name) throws CustomCheckedException,IOException {
		if(name== null)
			throw new CustomCheckedException("Name can not be null");
		
		return "Hellow ! "+name;
			
	}
	
	public static String ping(String time) throws CustomRuntimeException {
		if(time== null)
			throw new CustomRuntimeException("Time can not be null");
		
		return "Time ! "+time;
			
	}


}
