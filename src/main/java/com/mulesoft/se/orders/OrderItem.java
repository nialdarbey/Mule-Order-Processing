package com.mulesoft.se.orders;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * An item in an order.
 * 
 * @author Derek
 */
@XmlRootElement
public class OrderItem implements Serializable {

	/** Item number */
	private String productId;
	
	private PurchaseReceipt purchaseReceipt;

	/** Item name */
	private String name;
	
	/** Item manufacturer */
	private String manufacturer;

	/** Item quantity */
	private int quantity;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public PurchaseReceipt getPurchaseReceipt() {
		return purchaseReceipt;
	}

	public void setPurchaseReceipt(PurchaseReceipt purchaseReceipt) {
		this.purchaseReceipt = purchaseReceipt;
	}

}