<%
String fname=request.getParameter("FNAME");
String city=request.getParameter("CITY");

Cookie cfname=new Cookie("FNAME",fname);
Cookie ccity=new Cookie("CITY",city);

response.addCookie(cfname);
response.addCookie(ccity);
%>

<a href="result.jsp"> View Cookies </a>