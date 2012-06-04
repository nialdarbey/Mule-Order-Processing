package com.mulesoft.se.orders;

/**
 * Person associated with an order.
 * 
 * @author Derek
 */
public class OrderPerson {

	/** First name */
	private String firstName;

	/** Last name */
	private String lastName;

	/** City */
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}