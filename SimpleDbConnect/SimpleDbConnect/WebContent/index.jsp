<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
    
<%@ page import="com.mvc.model.*" %>    
<%@ page import="com.mvc.dao.*" %>  
<%@ page import="com.mvc.controller.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">

<table border="1">
	<tr>
	<td>id</td>
	
	<td>name</td>
	<td colspan="2"> <div align="center"> Action</div> </td>
	
	</tr>
				<%	
				  First first = new First();
				  
									
				//	PlacesDAO pdao = new PlacesDAO();
					
					FirstDAO firstDAO = new FirstDAO();
					ArrayList<First> listfirsts = firstDAO.getAllFirst();
					
					
					for (int i=0;i<listfirsts.size();i++)
					{
						
					 %>
					<tr>
				<td>
						<b><%=listfirsts.get(i).getId() %></b>
				</td>		
					<td>
						<b><%=listfirsts.get(i).getName() %></b>
				</td>    
				  <td><a href="#">Edit</a></td>
				  <td><a href="#">Delete</a></td>
				  
					 </tr>     
					      
					      
						
						
										
							
							
						
					
					
					<%
					}
					%>

 </table>
</div>


</body>
</html>