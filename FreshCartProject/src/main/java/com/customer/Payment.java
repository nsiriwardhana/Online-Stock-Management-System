package com.customer;

public class Payment {
	private int paymentID;
	private String amount;
	private String cHolderName;
	private String cardNumber;
	
	////constructor with parameters
	public Payment(int paymentID, String amount, String cHolderName, String cardNumber) {
		
		this.paymentID = paymentID;
		this.amount = amount;
		this.cHolderName = cHolderName;
		this.cardNumber = cardNumber;
	}

	//getters and setters
	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getcHolderName() {
		return cHolderName;
	}

	public void setcHolderName(String cHolderName) {
		this.cHolderName = cHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	

}
