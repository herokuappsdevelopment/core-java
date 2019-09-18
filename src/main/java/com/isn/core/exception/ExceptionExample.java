package com.isn.core.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int a = 10, b=1,c = 0;
		
		
			c = sum(a,b);
		
		System.out.println("Division of a/b = "+c);
		
		String name = "asdfg";
		System.out.println("Upper Case letters : "+convertLetterToUpperCase(name));
		

	}
	
	public static int sum(int a, int b) throws RuntimeException {
		
		if (b==0)
			throw new RuntimeException();
		
		return a/b;
	}
	
	public static String convertLetterToUpperCase(String text) {
		
		String formated = text;
		if(text != null)
			formated = text.toUpperCase();
		
		return formated;
	}

}
