<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight List</title>
</head>
<body>


	<%@ page import="adminservlet.*"%>
	<%@ page import="admin.*,java.util.*"%>
	<%@page import="java.util.ArrayList"%>

	<h1>Flight List</h1>
	<link rel="stylesheet" href="table.css">

	<%
	ArrayList<Flightpojo> flight = (ArrayList<Flightpojo>) request.getAttribute("flight");
	%>

	<table border="1"
		style="width: 83%; margin-left: 220px; margin-right: 20px;">
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
		

			<td><a href="delete-flight.jsp?id=<%=flight.get(I).getFlightId()%>&traveldate=<%=flight.get(I).getTravelDate()%>&depaturetime=<%=flight.get(I).getDepartureTime()%>&arrivaltime=<%=flight.get(I).getArrivalTime()%>&flightcapacity=<%=flight.get(I).getFlightCapacity()%>&flightfare=<%=flight.get(I).getFlightFare()%>">Edit</a></td>
	<td><a href="delete-flights.html?flight_id=<%=flight.get(I).getFlightId()%>">Delete</a></td>
			
		</tr>

		
		<%
		}
		%>




	</table>



	<a href="adminhome.jsp">back</a>


</body>
</html>
