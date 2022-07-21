<%
 Cookie[] c= request.getCookies();
%>
<h1> 
    Welcome Mr|Mr . <%=c[1].getValue() %>
	U R From :  <%=c[2].getValue() %>
</h1>