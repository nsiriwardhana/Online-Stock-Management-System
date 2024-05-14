package com.admin;

public class Admin {
	private int a_id;
	private String a_name;
	private String a_username;
	private String a_password;
	
	//constructor with parameters
	public Admin(int a_id, String a_name, String a_username, String a_password) {
		
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_username = a_username;
		this.a_password = a_password;
	}
	
	//getters and setters
	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_name() {
		return a_name;
	}

	public void setA_name(String a_name) {
		this.a_name = a_name;
	}

	public String getA_username() {
		return a_username;
	}

	public void setA_username(String a_username) {
		this.a_username = a_username;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}
}
