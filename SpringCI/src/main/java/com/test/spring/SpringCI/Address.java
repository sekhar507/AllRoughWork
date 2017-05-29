package com.test.spring.SpringCI;

public class Address {

	private String state;
	private String city;
	private String country;

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", country="
				+ country + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
