<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%float billAmount = (float) session.getAttribute("billAmount"); %>
<!DOCTYPE html>
<html>
<head>
<script type= "text/javascript" src="boookingbillcalculation.js"></script> 

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>




<style>
body {
	background-image:
		url("https://cdn.vox-cdn.com/thumbor/PmYyTzZasNGVIkNEtr2hXSC832c=/0x0:3840x2160/1820x1024/filters:focal(1613x773:2227x1387):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/67131996/A320Montpelier.0.png");
}

form {
	margin-left: 350px;
}

button {
	width: 100px;
	height: 50px;
	background-color: darkorange;
	margin-left: 250px;
	
}
</style>
<body>
	<br>
	<br>


	<form action="user-booking-hotel.html" method="post">

		<br> <br> <label for="hotelname"> Hotel Name:</label> <input
			readonly type="text" id="hotelname" style="outline: none; background-color: transparent;" name="hotelname"
			value="<%=request.getParameter("hotelname")%>"><br>
		<br> <label for="hotelplace"> Hotel Place:</label> <input
			readonly type="text" id="hotelplace" name="hotelplace" style="outline: none; background-color: transparent;"
			value="<%=request.getParameter("hotelplace")%>"><br>
		<br> <label for="numberofrooms"> Number Of Rooms:</label> <input
			type="number" id="numberofrooms" name="numberofrooms" min="1"
			max="100">
		
 <input type="button" id="btn" value="Get Bill"  style="outline: none; background-color: transparent;" onclick="myFunction1(); finalBill()"> 
		<br><br> Fare per Room : </label> <input readonly
			name="accomodationfareperroom" id="accomodationfareperroom"
			style="outline: none; background-color: transparent;"
			value="<%=request.getParameter("fareperday")%>"> <br>
		<br>

	
		<label for="totalaccomodationfare">Total Accomodation Fare :</label> <input type="text"
			name="totalaccomodationfare" id="totalaccomodationfare"><br><br>
	<labe>Total Flight Fare <input type="text" value="<%=billAmount %>">
		<label for="BillAmount">Final Bill Amount :</label> <input type="text"
			name="billAmount" id="finalbill"><br>
		<br><br> Payment Mode: <input type="radio" class="question selection"
			name="Answer_1" id="Answer_1" value="Selection_MA--" />
		</td>
		<td valign="center"><span class="answer text">Google Pay</span></td>
		<td valign="center"><input type="radio"
			class="question selection" name="Answer_1" id="Answer_1"
			value="Selection_MQ--" /></td>
		<td valign="center"><span class="answer text">Phone Pay</span></td> <br>
		<br>


		<button type="submit" name="submit" value="Submit" >Submit</button>
		<br> <br>
	</form>
</body>
</html>
<!--  <script type="text/javascript">

function myFunction1() 
    {        
              var numVal1 = Number(document.getElementById("numberofrooms").value);
              var numVal2 = Number(document.getElementById("accomodationfareperroom").value);
              var totalValue=(numVal1*numVal2);
              document.getElementById("totalaccomodationfare").value = totalValue.toFixed(2);
              
          }
function generateBill(){
	  
     var discount = Number(document.getElementById("discountpercentage").value);
      var totalTicketFare = Number(document.getElementById("totalticketfare").value);
      var x= (discount/100);
      var billAmount = (x*totalTicketFare);
      document.getElementById("billamount").value = billAmount.toFixed(2);

     
	  
}

</script> -->
