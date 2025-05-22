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
    String stockSymbol = preferences.getValue("symbol", "");
    String stockName = preferences.getValue("name", "");

    String stockPrice = (String) request.getAttribute("stockPrice");
    String stockChange = (String) request.getAttribute("change");
    String stockPercentChange = (String) request.getAttribute("percentChange");
    String stockDirection = (String) request.getAttribute("direction");

    double changeValue = 0.0;

    if (Validator.isNotNull(stockChange)) {
        try {
            changeValue = Double.parseDouble(stockChange);
        } catch (NumberFormatException e) {
        }
    }

    String color = "black";
    String stockChangeIcon = "";

    if (Validator.isNotNull(stockDirection)) {
        if ("up".equalsIgnoreCase(stockDirection)) {
            color = "#18cccc";
            stockChangeIcon = "+";
        } else if ("down".equalsIgnoreCase(stockDirection)) {
            color = "red";
            stockChangeIcon = "-";
        } else if ("neutral".equalsIgnoreCase(stockDirection)) {
            color = "black";
        }
    }
%>
