<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<liferay-theme:defineObjects />
<portlet:defineObjects />
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <select class="news_media_select3" id="publication" name="publication">
 		<option value="">&nbsp;&nbsp; -Select Publication- &nbsp;&nbsp;</option>  
		<c:forEach items="${publicationList}" var="publication">
			<c:if test="${not empty publication}">
				<option value="${publication}">&nbsp;&nbsp; ${publication} &nbsp;&nbsp;</option>
			</c:if>
		</c:forEach>
		 </select>  
<style>
.table_head {
    background: #0F75BD;
    color: #fff;
    font-weight: bold;
}
.head_th {
    border: 1px solid #ccc;
    text-align: center;
    padding: 10px 10px;
}
</style>
 
