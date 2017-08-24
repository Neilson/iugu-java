package com.iugu.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.iugu.model.DataMethod;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethodsResponse {

	private String id;
	private String description;
	private String item_type;
	private DataMethod data;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getItem_type() {
		return item_type;
	}

	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}

	public DataMethod getData() {
		return data;
	}

	public void setData(DataMethod data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "PaymentMethodsResponse{" +
				"id='" + id + '\'' +
				", description='" + description + '\'' +
				", item_type='" + item_type + '\'' +
				", Data=" + data +
				'}';
	}
}
