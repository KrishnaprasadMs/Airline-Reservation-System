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

	<h1>Newly Add Flight Details</h1>
	<table width="100%" cellspacing="0" cellpadding="10" border="1"
		bordercolor="silver">
		<tr>
			<th>Airline Name</th>
			<th>Flight Number</th>
			<th>Source</th>
			<th>Destination</th>
			<th>Travel Date</th>
			<th>Departure Time</th>
			<th>Arrival Time</th>
			<th>Flight Capacity</th>
			<th>Fight Fare</th>
		</tr>
		<tr>
			<td><%=flight.getAirLineName()%></td>
			<td><%=flight.getFlightNumber()%></td>
			<td><%=flight.getSource()%></td>
			<td><%=flight.getDestination()%></td>
			<td><%=flight.getTravelDate()%></td>
			<td><%=flight.getDepartureTime()%></td>
			<td><%=flight.getArrivalTime()%></td>
			<td><%=flight.getFlightCapacity()%></td>
			<td><%=flight.getFlightFare()%></td>
			
		</tr>


	</table>
	
		<a href="addFlightform.html">back</a>

</body>
</html>