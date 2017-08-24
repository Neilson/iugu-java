package com.iugu.enums;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


public enum PayableWith implements Serializable{

	CREDIT_CARD("credit_card"), ALL("all"), BANK_SLIP("bank_slip");

	private String value;

	private PayableWith(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	@JsonCreator
	public static PayableWith fromStringOperator(String stringOperator) {
		if(stringOperator != null) {
			for(PayableWith payableWith: PayableWith.values()){
				if (stringOperator.equalsIgnoreCase(payableWith.value)) {
					return payableWith;
				}
			}
		}
		return null;
	}
}
