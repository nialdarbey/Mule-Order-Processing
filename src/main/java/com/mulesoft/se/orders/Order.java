package com.mulesoft.se.orders;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * An order.
 * 
 * @author Derek
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {

	@XmlElement(name = "orderId")
	private String orderId;

	/** Customer associated with order */
	@XmlElement(name = "customer")
	private OrderPerson customer;

	/** List of items on an order */
	@XmlElement(name = "item")
	private List<OrderItem> items;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderPerson getCustomer() {
		return customer;
	}

	public void setCustomer(OrderPerson customer) {
		this.customer = customer;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
}