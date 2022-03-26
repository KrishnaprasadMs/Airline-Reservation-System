<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="userloginservletclasses.*"%>
<%@ page import="userlogin.*,java.util.*"%>
<%
    ArrayList<LoginUser> users = (ArrayList<LoginUser>)request.getAttribute("users"); 
%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">

body {
    background-image: url("https://tse3.explicit.bing.net/th?id=OIP.VYo5LC7nK49JDo4LcNdQjgHaEK&pid=Api&P=0&w=281&h=158.png");
}
</style>
<meta charset="ISO-8859-1">
<title>All User Details</title>
<script type="text/javascript" ></script>
</head>
<body>
	<h1>List Of All User Details</h1>
	<table width="100%" cellspacing="2" cellpadding="10" border="2"
		bordercolor="grey">
		<tr>
			<th>User Id</th>
			<th>Full Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>Password</th>
			<th>Confirm Password</th>
		</tr>
		<%
		for (int I = 0; I < users.size(); I++) {
		%>
		<tr>
			<td><%=users.get(I).getId()%></td>
			<td><%=users.get(I).getFullName()%></td>
			<td><%=users.get(I).getEmail()%></td>
			<td><%=users.get(I).getPhoneNumber()%></td>
			<td><%=users.get(I).getPassword()%></td>
			<td><%=users.get(I).getConfirmPassword()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<div style="margin-top: 20px">
	
	<a href="adminhome.jsp" style="margin-left: 30px">back</a>
	
	</div>
</body>
</html>