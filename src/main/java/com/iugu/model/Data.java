package com.iugu.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data implements Serializable {

	private static final long serialVersionUID = 3785705464331322710L;

	public Data() {
	}

	public Data(String number, String verificationValue, String firstName, String lastName, String month, String year) {
		this.number = number;
		this.verificationValue = verificationValue;
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.year = year;
	}

	@JsonProperty(value="number", required=true)
	String number;

	@JsonProperty(value="verification_value", required=true)
	String verificationValue;

	@JsonProperty(value="first_name", required=true)
	String firstName;

	@JsonProperty(value="last_name", required=true)
	String lastName;

	@JsonProperty(value="month", required=true)
	String month;

	@JsonProperty(value="year", required=true)
	String year;

	public String getNumber() {
		return number;
	}

	public String getVerificationValue() {
		return verificationValue;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMonth() {
		return month;
	}

	public String getYear() {
		return year;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Data{");
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
