<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:saxon="http://saxon.sf.net/" xmlns:soap="net.sf.kernow.soapextension.SOAPExtension"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
	version="2.0" exclude-result-prefixes="xs">
	<xsl:output indent="yes" />
	<xsl:param name="request" />
	<xsl:template match="/">
		<soapenv:Envelope xmlns:ord="http://orders.se.mulesoft.com/">
			<soapenv:Body>
				<ord:processOrder>
					<xsl:value-of select="$request" />
				</ord:processOrder>
			</soapenv:Body>
		</soapenv:Envelope>
	</xsl:template>
</xsl:stylesheet>