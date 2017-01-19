package com.web.registration.bean;


public class UserInfo {

	private String name;
	private String password;
	private String email;
	private String dob;
	private String desgination;
	
	
	public void setName(String name) {
		this.name = name;
	}
	

	public void setPassword(String password) {
		this.password = password;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public String getDesgination() {
		return desgination;
	}
	
}
