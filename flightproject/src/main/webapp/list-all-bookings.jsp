<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*, booking.*"%>
<%
    ArrayList<BookingViewPojo> bookings = (ArrayList<BookingViewPojo>)request.getAttribute("bookings"); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Bookings </title>
<style>
body {  
      background-image: url('https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F28%2F2019%2F07%2Fkatikies-hotel-greece-78-BESTHOTELSWB19.jpg');
    
}  
</style>
</head>
<body>
	<h1>List Of All Bookings</h1>
	<table width="100%" cellspacing="2" cellpadding="10" border=" 4"
		bordercolor="black">
		<tr>
			<th>Booking Id</th>
			<th>Email</th>
			<th>Booking Type</th>
			<th>TravelDate</th>
			<th>Source</th>
	         <th>Destination</th>
	         <th>Departure Date</th>
			 <th>Arrival Time</th>
			<th>Discound Percentages</th>
			<th>Return Date</th>
			<th>Number of Passengers</th>
			<th>Ticket Fare</th>
			<th>Total Ticket Fare</th>
			<th>Bill Amount</th>
			
		</tr>
		<%
		for (int I = 0; I < bookings.size(); I++) {
		%>
		<tr>
			<td><%=bookings.get(I).getBookingId()%></td>
			<td><%=bookings.get(I).getEmail()%></td>
			<td><%=bookings.get(I).getBookingType()%></td>
			<td><%=bookings.get(I).getTravelDate()%></td>
			<td><%=bookings.get(I).getSource()%></td>
			<td><%=bookings.get(I).getDestination()%></td>
			<td><%=bookings.get(I).getDepartureYime()%></td>
						<td><%=bookings.get(I).getArrivalTime()%></td>
						<td><%=bookings.get(I).getDiscoundPercentage()%></td>
						<td><%=bookings.get(I).getReturnDate()%></td>
						<td><%=bookings.get(I).getNumberOfPassengers()%></td>
						<td><%=bookings.get(I).getTicketFare()%></td>
						<td><%=bookings.get(I).getTotalTicketFare()%></td>
						<td><%=bookings.get(I).getBillAmount()%></td>
						
			
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>