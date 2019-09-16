/**
 * 
 */
package com.isn.core.overloading;

/**
 * @author VenkatS
 *
 */
public class ClsC extends ClsB {

	@Override
	public void method1() {
		System.out.println(" ClsC ");
		super.method1();
	}
	
	public static void main(String[] args) {
		
		ClsC clss = new ClsC();
		clss.method1();
		
	}
	
	

}
