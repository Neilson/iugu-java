package com.iugu.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataMethod implements Serializable {

	private static final long serialVersionUID = 3785705464331322710L;
	private String brand;
	private String holder_name;
	private String display_number;
	private String bin;
	private String month;
	private String year;
	private String fingerprint;

	public DataMethod() {
	}

	public DataMethod(String brand, String holder_name, String display_number, String bin, String month, String year, String fingerprint) {
		this.brand = brand;
		this.holder_name = holder_name;
		this.display_number = display_number;
		this.bin = bin;
		this.month = month;
		this.year = year;
		this.fingerprint = fingerprint;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getHolder_name() {
		return holder_name;
	}

	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}

	public String getDisplay_number() {
		return display_number;
	}

	public void setDisplay_number(String display_number) {
		this.display_number = display_number;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("DataMethod{");
		sb.append(", holder_name='").append(holder_name).append('\'');
		sb.append(", display_number='").append(display_number).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
