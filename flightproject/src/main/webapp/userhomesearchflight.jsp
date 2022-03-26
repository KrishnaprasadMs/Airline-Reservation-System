<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="adminservlet.*"%>
	<%@ page import="admin.*,java.util.*"%>
	<%@page import="java.util.ArrayList"%>
	

	<%
	ArrayList<Flightpojo> flight = (ArrayList<Flightpojo>) request.getAttribute("flight");
	%>

<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight List</title>
</head>
<body>


	<h1>Flight List</h1>
	<link rel="stylesheet" href="table.css">



	<table border="1"
		style="width: 83%; margin-left: 150px; margin-right: 50px;">
<tr>
			<th>FLight Id</th>
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

		<%
		for (int I = 0; I < flight.size(); I++) {
		%>
		<tr>
		
			<td><%=flight.get(I).getFlightId()%></td>
			<td><%=flight.get(I).getAirLineName()%></td>
			<td><%=flight.get(I).getFlightNumber()%></td>
			<td><%=flight.get(I).getSource()%></td>
			<td><%=flight.get(I).getDestination()%></td>
			<td><%=flight.get(I).getTravelDate()%></td>
			<td><%=flight.get(I).getDepartureTime()%></td>
			<td><%=flight.get(I).getArrivalTime()%></td>
			<td><%=flight.get(I).getFlightCapacity()%></td>
			<td><%=flight.get(I).getFlightFare()%></td>
		<td><form action="flightbooking.jsp" method="post">
		<input type="hidden" value="<%=flight.get(I).getSource()%>" name="source">
		<input type="hidden" value="<%=flight.get(I).getDestination()%>" name="destination">
		<input type="hidden" value="<%=flight.get(I).getTravelDate()%>" name="traveldate">
		<input type="hidden" value="<%=flight.get(I).getDepartureTime()%>" name="departuretime">
		<input type="hidden" value="<%=flight.get(I).getArrivalTime()%>" name="arrivaltime">
		<input type="hidden" value="<%=flight.get(I).getArrivalTime()%>" name="ticketfare">
		<input type="submit" value="book">
		
		
		</form></td>

		</tr>

		
		<%
		}
		%>




	</table>



	


</body>
</html>
