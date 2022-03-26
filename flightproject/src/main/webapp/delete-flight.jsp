<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="admin.*,java.util.*"%>

<%
Flightpojo flight = (Flightpojo) request.getAttribute("flight");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Edit Flight Details</h1>
	<form action = "upadate-flights.html" method = "post">
		<input type = "hidden" name = "flightId" value = "<%=request.getParameter("id")%>">
	
	<input type = "text" name = "traveldate" value = "<%=request.getParameter("traveldate")%>">
		<input type = "text" name = "depaturetime" value = "<%=request.getParameter("depaturetime")%>">
			<input type = "text" name = "arrivaltime" value = "<%=request.getParameter("arrivaltime")%>">
				<input type = "text" name = "flightcapacity" value = "<%=request.getParameter("flightcapacity")%>">
					<input type = "text" name = "flightfare" value = "<%=request.getParameter("flightfare")%>">
						<input type = "submit"  value = "Edit">
					
				
			
		
	
	</form>

</body>
</html>