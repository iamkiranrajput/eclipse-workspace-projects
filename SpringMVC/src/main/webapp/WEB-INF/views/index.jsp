<%@page import="java.util.List"%>
<html>
<body>
<h2>Home page!</h2>
<h1>this is home page</h1>

<%
		String name= (String) request.getAttribute("name");
		Integer id= (Integer) request.getAttribute("id");
		List<String> friends = (List<String>) request.getAttribute("friends");
		
%>
		<h1>Name is <%=name %></h1>
		<h1>id is <%= id %></h1>
		
		<%for(String s: friends){
			%>
		  
			<h1><%=s %></h1>
		
			<%	
			}	
			%>
			
		
		

</body>
</html>
