package com.mulesoft.se.samsung;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import com.mulesoft.se.orders.OrderItem;

public class OrderItemToOrderRequest extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		OrderItem payload = (OrderItem) src;
		OrderRequest req = new OrderRequest();
		req.setName("Sam");
		return req;
	}

}
