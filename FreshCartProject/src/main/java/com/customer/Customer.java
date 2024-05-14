package com.customer;

public class Customer {
	private int cus_id;
	private String cus_name;
	private String cus_email;
	private String cus_phone;
	private String cus_username;
	private String cus_password;
	
	//constructor with parameters
	public Customer(int cus_id, String cus_name, String cus_email, String cus_phone, String cus_username,
			String cus_password) {
		
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.cus_email = cus_email;
		this.cus_phone = cus_phone;
		this.cus_username = cus_username;
		this.cus_password = cus_password;
	}

	
	//getters and setters
	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getCus_email() {
		return cus_email;
	}

	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}

	public String getCus_phone() {
		return cus_phone;
	}

	public void setCus_phone(String cus_phone) {
		this.cus_phone = cus_phone;
	}

	public String getCus_username() {
		return cus_username;
	}

	public void setCus_username(String cus_username) {
		this.cus_username = cus_username;
	}

	public String getCus_password() {
		return cus_password;
	}

	public void setCus_password(String cus_password) {
		this.cus_password = cus_password;
	}
	
	
	
	 
	
}
