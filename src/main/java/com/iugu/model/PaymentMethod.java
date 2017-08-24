package com.iugu.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethod implements Serializable{
	private static final long serialVersionUID = -8934205393711080140L;

	public PaymentMethod(){
	}

	public PaymentMethod(String account_id, String token, String description, Boolean isDefault) {
		this.description = description;
		this.isDefault = isDefault;
		this.token = token;
		this.accountId = account_id;
	}

	@JsonProperty("account_id")
	private String accountId;
	
	private String description;
	private String token;
	
	@JsonProperty("set_as_default")
	private Boolean isDefault;


	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "PaymentMethod{" +
				"description='" + description + '\'' +
				", token='" + token + '\'' +
				", isDefault=" + isDefault +
				'}';
	}
}
