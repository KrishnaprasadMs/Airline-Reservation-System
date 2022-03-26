<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*, admin.*"%>
    
    <%
ArrayList<Flightpojo> flights = (ArrayList<Flightpojo>) request.getAttribute("flights");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All flights</title>
</head>
<body>
	<h1>List of All FlightInfo</h1>
	<table width="100%" cellspacing="2" cellpadding="10" border="2"
		bordercolor="blue">

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
		for (int I = 0; I < flights.size(); I++) {
		%>
		<tr>
			<td><%=flights.get(I).getFlightId()%></td>
			<td><%=flights.get(I).getAirLineName()%></td>
			<td><%=flights.get(I).getFlightNumber()%></td>
			<td><%=flights.get(I).getSource()%></td>
			<td><%=flights.get(I).getDestination()%></td>
			<td><%=flights.get(I).getTravelDate()%></td>
			<td><%=flights.get(I).getDepartureTime()%></td>
			<td><%=flights.get(I).getArrivalTime()%></td>
			<td><%=flights.get(I).getFlightCapacity()%></td>
			<td><%=flights.get(I).getFlightFare()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>