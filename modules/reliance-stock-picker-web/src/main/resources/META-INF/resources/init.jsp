<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import="com.reliance.stock.picker.preferences.RelianceStockPickerConfiguration"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ page import="javax.portlet.PortletPreferences" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
    PortletPreferences preferences = renderRequest.getPreferences();
    String symbol = preferences.getValue("symbol", "");
     String name = preferences.getValue("name", "");
%>
