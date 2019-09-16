/**
 * 
 */
package com.isn.core.overloading;

/**
 * @author VenkatS
 *
 */
public class OverloadingJava {
	
	public int sum(int a, int b) {
		
		System.out.println("sum int");
		return a+b;
		
	}
	
	public int sum(Integer a, Integer b) {
		System.out.println("sum object");
		return a+b;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =5,b=6;
		OverloadingJava overloading = new OverloadingJava();
		overloading.sum(new Integer(0), new Integer(6));
	}

}
