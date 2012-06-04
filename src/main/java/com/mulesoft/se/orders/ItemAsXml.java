package com.mulesoft.se.orders;

import java.io.ByteArrayOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.mule.api.transformer.TransformerException;
import org.mule.config.i18n.Message;
import org.mule.config.i18n.MessageFactory;
import org.mule.transformer.AbstractTransformer;

/**
 * Converts an item to XML.
 * 
 * @author Derek
 */
public class ItemAsXml extends AbstractTransformer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.mule.transformer.AbstractTransformer#doTransform(java.lang.Object,
	 * java.lang.String)
	 */
	protected Object doTransform(Object payload, String encoding)
			throws TransformerException {
		try {
			OrderItem item = (OrderItem) payload;
			JAXBContext context = JAXBContext.newInstance(OrderItem.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			marshaller.marshal(item, output);
			return new String(output.toByteArray());
		} catch (JAXBException e) {
			Message message = MessageFactory
					.createStaticMessage("Unable to marshal OrderItem.");
			throw new TransformerException(message, this, e);
		}
	}
}