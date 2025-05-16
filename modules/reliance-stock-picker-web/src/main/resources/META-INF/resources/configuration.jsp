<%@ include file="/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%= true %>" var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%= true %>" var="configurationRenderURL" />

<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
	<aui:input name="<%= com.liferay.portal.kernel.util.Constants.CMD %>" type="hidden" value="<%= com.liferay.portal.kernel.util.Constants.UPDATE %>" />
	<aui:input name="redirect" type="hidden" value="<%= configurationRenderURL %>" />

	<aui:fieldset>
		<aui:input label="Stock Symbol" name="symbol" value="<%=symbol%>"/>
		<aui:input label="Stock Name" name="name" value="<%=name%>"/>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit" value="Save" />
	</aui:button-row>
</aui:form>
