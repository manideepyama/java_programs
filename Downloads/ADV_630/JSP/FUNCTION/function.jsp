<%! 
   public int sum(int x,int y)
       { return (x+y); }
%>

<% 
    int s=sum(10,20);
	out.print("<h1> Sum is : "+s+"</h1>");
%>