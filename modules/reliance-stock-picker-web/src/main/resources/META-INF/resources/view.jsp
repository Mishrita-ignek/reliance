<%@ include file="/init.jsp"%>

<div class = "stock-details-section">
    <div class="stock-card stock-card1">
       <div class="stock-graph <%=stockDirection%>">
          <h3><%=stockName%></h3>
          <div class="stock-price">
             &#x20b9; <%= stockPrice %>
          </div>
          <div class="stock-change" style="color:<%= color %>;">
             <div class="stock-change-percentage">
                <% if ("up".equals(stockDirection)) { %>
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512" fill="<%=color%>"><path d="M214.6 41.4c-12.5-12.5-32.8-12.5-45.3 0l-160 160c-12.5 12.5-12.5 32.8 0 45.3s32.8 12.5 45.3 0L160 141.2 160 448c0 17.7 14.3 32 32 32s32-14.3 32-32l0-306.7L329.4 246.6c12.5 12.5 32.8 12.5 45.3 0s12.5-32.8 0-45.3l-160-160z"/></svg>
                <% } else if ("down".equals(stockDirection)) { %>
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512" fill="<%=color%>"><path d="M169.4 470.6c12.5 12.5 32.8 12.5 45.3 0l160-160c12.5-12.5 12.5-32.8 0-45.3s-32.8-12.5-45.3 0L224 370.8 224 64c0-17.7-14.3-32-32-32s-32 14.3-32 32l0 306.7L54.6 265.4c-12.5-12.5-32.8-12.5-45.3 0s-12.5 32.8 0 45.3l160 160z"/></svg>
                <% } %>
                <span><%= stockPercentChange %>%</span>
             </div>
             <div class="stock-change-price">
                <span><%= stockChangeIcon %>&#x20b9;<%= String.format("%.2f", Math.abs(changeValue)) %></span>
                <span>Today</span>
             </div>
          </div>
       </div>
    </div>
</div>