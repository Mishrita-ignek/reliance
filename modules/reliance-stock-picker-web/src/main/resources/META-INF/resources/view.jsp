<%@ include file="/init.jsp"%>

<%
    String priceDiff = (String) request.getAttribute("priceDiff");
    String stockPrice = (String) request.getAttribute("stockPrice");
%>

<div class="stock-card stock-card1">
   <div class="stock-graph">
      <h3><%=name%></h3>
      <div class="stock-price" style="<%= "up".equals(priceDiff) ? "color:green;" : "down".equals(priceDiff) ? "color:red;" : "" %>">
       &#x20b9; <%= stockPrice %></div>
   </div>
</div>