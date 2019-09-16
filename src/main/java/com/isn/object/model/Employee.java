/**
 * 
 */
package com.isn.object.model;

/**
 * @author VenkatS
 *
 */
public class Employee  {
	
	private String empId;
	private String name;
	private String email;
	private String company;
	
	Address caddr = new CurrentAddress();
	
	Address permAddr= new PermanentAddress();
	
	
	public Employee() {
	}
	
	public Employee(String empId,String name,String email,String company) {
		this.empId=empId;
		this.name=name;
		this.email=email;
		this.company=company;
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	

}
