package com.isn.core.array.example;

import com.isn.object.model.Employee;

public class ObjectArrayTest {

	public static void main(String[] args) {
		Employee[] employees=getEmp();
		
		System.out.println(employees.length);

	}
	
	static Employee[] getEmp() {
		
		return new Employee[] {new Employee()};
		
	}

}
