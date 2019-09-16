package com.isn.core.constructor;

public class Constructor {
	static String value;
	public void Constructor() {
		value="hello";
	}

	public static void main(String[] args) {
		
		Constructor Constructor = new Constructor();
		System.out.println(value);
	}

}
