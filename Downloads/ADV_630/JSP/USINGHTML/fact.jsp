<% 
   int no=
   Integer.parseInt(request.getParameter("NO"));
   int f=1;
   for(int i=1;i<=no;i++)
           { f=f*i; }
%>

<body bgcolor=green text=white>
   <h1 align=center> Fact is : <%=f%> </h1>
</body>