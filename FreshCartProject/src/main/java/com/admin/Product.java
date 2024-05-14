package com.admin;

public class Product {
	private int pID;
	private String pName;
	private String pPrice;
	private String pQty;
	
	//constructor with parameters
	public Product(int pID, String pName, String pPrice, String pQty) {
		
		this.pID = pID;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQty = pQty;
	}

	
	//getters and setters
	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpPrice() {
		return pPrice;
	}

	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}

	public String getpQty() {
		return pQty;
	}

	public void setpQty(String pQty) {
		this.pQty = pQty;
	}
	
	
		
}
