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
public class OrderSummary {

	@XmlElement(name = "orderId")
	private String orderId;
	
	@XmlElement(name="item")
	@XmlElementWrapper(name = "items")
	private List<PurchaseReceipt> items;

}