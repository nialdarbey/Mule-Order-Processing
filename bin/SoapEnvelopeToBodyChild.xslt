<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ord="http://orders.se.mulesoft.com/"
	version="2.0" exclude-result-prefixes="xs">
	<xsl:output indent="yes" />
	<xsl:template match="/soapenv:Envelope/soapenv:Body/ord:processOrderResponse">
		<xsl:copy-of select="./summary" />
	</xsl:template>
</xsl:stylesheet>