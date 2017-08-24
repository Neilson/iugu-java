package com.iugu.services;

import com.iugu.IuguConfiguration;
import com.iugu.exceptions.IuguException;
import com.iugu.model.PaymentToken;
import com.iugu.responses.PaymentTokenResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class PaymentTokenService {

	@SuppressWarnings("unused")
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private IuguConfiguration iugu;
	private final String CREATE_URL = IuguConfiguration.url("/payment_token");
	private final String FIND_URL = IuguConfiguration.url("/payment_token/%s");
	//private final String CREATE_URL = IuguConfiguration.url("/customers/7640036B7C5B4ABCA5487C784DE32387/payment_token");
	//private final String FIND_URL = IuguConfiguration.url("/customers/%s/payment_token");

	public PaymentTokenService(IuguConfiguration iuguConfiguration) {
		this.iugu = iuguConfiguration;
	}

	public PaymentTokenResponse create(PaymentToken paymentToken) throws IuguException {
		//LOG.info("IUGU-JAVA: Create Payment Token {}", paymentToken);
		Response response = this.iugu.getNewClientNotAuth().target(CREATE_URL).request().post(Entity.entity(paymentToken, MediaType.APPLICATION_JSON));

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(PaymentTokenResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error creating token!", ResponseStatus, ResponseText);
	}

	public PaymentTokenResponse find(String id) throws IuguException {
		Response response = this.iugu.getNewClientNotAuth().target(String.format(FIND_URL, id)).request().get();

		int ResponseStatus = response.getStatus();
		String ResponseText = null;

		if (ResponseStatus == 200)
			return response.readEntity(PaymentTokenResponse.class);

		// Error Happened
		if (response.hasEntity())
			ResponseText = response.readEntity(String.class);

		response.close();

		throw new IuguException("Error finding customer!", ResponseStatus, ResponseText);
	}

}
