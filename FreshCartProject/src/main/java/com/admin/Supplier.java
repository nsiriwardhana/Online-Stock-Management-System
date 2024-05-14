package com.admin;

public class Supplier {
	private int sID;
	private String sName;
	private String sEmail;
	private String sAddress;
	private String sPhone;
	
	//constructor with parameters
	public Supplier(int sID, String sName, String sEmail, String sAddress, String sPhone) {
		
		this.sID = sID;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sAddress = sAddress;
		this.sPhone = sPhone;
	}

	
	//getters and setters
	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}
	
	
		
}
