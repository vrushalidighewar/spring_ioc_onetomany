package com.app.pojo;

import java.util.List;

public class Address {

	//private String city;
	                         /* java.lang.IllegalStateException: Cannot convert value of type 'java.util.ArrayList' 
	                           to required type 'java.lang.String'*/
	private String city;
	
	public Address() {
		
	}
	
	public Address(String city) {
		this.city=city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	
}
