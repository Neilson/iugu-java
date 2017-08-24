package com.iugu.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

	private String description;
	
	private Integer quantity;
	
	@JsonProperty("price_cents")
	private Integer priceCents;
	
	public Item() {
		
	}
	
	public Item(String description, Integer quantity, Integer priceCents) {
		this.description = description;
		this.quantity = quantity;
		this.priceCents = priceCents;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPriceCents() {
		return priceCents;
	}

	public void setPriceCents(Integer priceCents) {
		this.priceCents = priceCents;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Item{");
		sb.append(", description='").append(description).append('\'');
		sb.append(", quantity=").append(quantity);
		sb.append(", priceCents=").append(priceCents);
		sb.append('}');
		return sb.toString();
	}
}
