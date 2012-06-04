package com.mulesoft.se.samsung;

import javax.jws.WebService;

@WebService(endpointInterface="com.mulesoft.se.samsung.SamsungService", name="SamsungService")
public class SamsungServiceImpl implements SamsungService {

	@Override
	public OrderResponse purchase(OrderRequest orderRequest) {
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setId("1");
		orderResponse.setResult("ACCEPTED");
		orderResponse.setPrice("2550");
		return orderResponse;
	}

}