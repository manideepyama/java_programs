
<% 
   String un=request.getParameter("UN");
   String pw=request.getParameter("PW");
%>

<% 
   if(un.equals(pw))
   {
	   response.sendRedirect
		   ("login.jsp?STATUS='Invalid UN or PW..!' ");
   }
   else
   {
 RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
   rd.include(request,response);
   }
%>