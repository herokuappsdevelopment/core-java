package com.isn.core.overiding;

import com.isn.object.model.Address;
import com.isn.object.model.CurrentAddress;
import com.isn.object.model.PermanentAddress;

public class OveridingExample {

	public static void main(String[] args) {
		
		Address addr = new CurrentAddress();	
		addr.setAddressLine1("hyd1");
		addr.setAddressType("CR");
		
		System.out.println(addr.address());
		
		addr = new PermanentAddress();
		addr.setAddressLine1("hyd2");
		addr.setAddressType("PR");
		
		System.out.println(addr.address());
		
	}

}
