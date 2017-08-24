package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.PaymentMethod;
import com.iugu.responses.PaymentMethodsResponse;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class PaymentMethodService {

	private IuguConfiguration iugu;
	private final String DEFAULT_PAYMENT_URL = IuguConfiguration.url("/customers/%s/payment_methods");
	private final String FIND_URL = IuguConfiguration.url("/customers/%s/payment_methods/%s");

	public PaymentMethodService(IuguConfiguration iuguConfiguration) {
		this.iugu = iuguConfiguration;
	}

	public String setDefault(String customerId, PaymentMethod paymentMethod) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(DEFAULT_PAYMENT_URL, customerId)).request().post(Entity.entity(paymentMethod, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(String.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error set default payment!", ResponseStatus, ResponseText);
	}
	
	public PaymentMethodsResponse create(String customerId, PaymentMethod paymentMethod) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(DEFAULT_PAYMENT_URL, customerId)).request().post(Entity.entity(paymentMethod, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(PaymentMethodsResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error set default payment!", ResponseStatus, ResponseText);
	}
	
	public PaymentMethodsResponse find(String customerId, String paymentId) throws IuguException {
		Response response = this.iugu.getNewClient().target(String.format(FIND_URL, customerId, paymentId)).request().get();

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(PaymentMethodsResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error finding customer!", ResponseStatus, ResponseText);
	}	
}
