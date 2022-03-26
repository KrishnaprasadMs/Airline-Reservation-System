<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*, package1.*"%>
<%
    ArrayList<Hotel> hotels = (ArrayList<Hotel>)request.getAttribute("hotels"); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Hotels </title>
<style>
body {  
      background-image: url('https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F28%2F2019%2F07%2Fkatikies-hotel-greece-78-BESTHOTELSWB19.jpg');
    
}  
</style>
</head>
<body>

	<h1>List Of All Hotels</h1>
	<table width="100%" cellspacing="2" cellpadding="10" border=" 4"
		bordercolor="black">
		<tr>
			<th>Hotel Id</th>
			<th>Hotel Name</th>
			<th>Hotel Place</th>
			<th>Number of Rooms</th>
			<th>Fare per Day</th>
		</tr>
		<%
		for (int I = 0; I < hotels.size(); I++) {
		%>
		<tr>
			<td><%=hotels.get(I).getHotelId()%></td>
			<td><%=hotels.get(I).getHotelName()%></td>
			<td><%=hotels.get(I).getHotelPlace()%></td>
			<td><%=hotels.get(I).getNumOfRooms()%></td>
			<td><%=hotels.get(I).getFarePerDay()%></td>
			<td><form action="flightbookingpage2.jsp" method="post">
				<input type="hidden" value="<%=hotels.get(I).getHotelName()%>" name="hotelname">
		
				<input type="hidden" value="<%=hotels.get(I).getHotelPlace()%>" name="hotelplace">
		
		<input type="hidden" value="<%=hotels.get(I).getFarePerDay()%>" name="fareperday">
		
	<input type="submit" value="book"></form></td>
		
			
			
		</tr>
		<%
		}
		%>
	</table>
	
</body>
</html>