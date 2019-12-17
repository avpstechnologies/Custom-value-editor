package com.avps;

import java.io.Serializable;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7664995438971109794L;

	private String state;
	
	private String licensePlate;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	/**
     * returns the offer with a given code
     * @param code the promotional offer code
     * @return the offer with this code
     */
    
   
}
