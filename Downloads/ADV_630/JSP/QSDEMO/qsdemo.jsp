<%
  int v1=
  Integer.parseInt( request.getParameter("V1"));
  int v2=
  Integer.parseInt(request.getParameter("V2"));
%>

<%! public int sum(int x,int y)
        { return (x+y); } %>

<h1 align=center> Sum is : <%= sum(v1,v2) %> </h1>





