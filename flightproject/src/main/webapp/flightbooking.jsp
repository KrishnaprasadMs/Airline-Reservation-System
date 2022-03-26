<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type= "text/javascript" src="boookingbillcalculation.js"></script> 

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<title>  
Registration Page  
</title>  

 
<style>
body {
	background-image:
		url("https://cdn.vox-cdn.com/thumbor/PmYyTzZasNGVIkNEtr2hXSC832c=/0x0:3840x2160/1820x1024/filters:focal(1613x773:2227x1387):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/67131996/A320Montpelier.0.png");
}
form{
margin-left:350px;
}
button{
width:100px;
height:50px;

background-color :darkorange;
margin-left:250px;
}

</style>
<body >  
<br>  
<br>  
<form action="insert-booking.html" method="post" >  
  
<label>
Email:
<input type="email" value="" name="email">
</label>


</label>
<br><br>
 <label>
 Booking Type:
 <input type="radio" class="question selection" name="bookingtype" id="oneway" value="oneway"  /></td>
      <td valign="center"><span class="answer text">One Way</span></td>
<td valign="center">
<input type="radio" class="question selection" name="bookingtype" id="twoway" value="twoway" /></td>
      <td valign="center"><span class="answer text">Round Trip</span></td>
      <input type="button" id="btn" value="Apply" onclick="answer()">  
<br><br>
<label>
Return  Date <br>
 <input type = "date" name = "returndate" id="returndate"><br></label>
<br>  
<br> 
<label for="passengnernumber" >Passengers Number </label>
  <input type="number" id="passengernumber" name="numberofpassengers" min="1" max="100"><br><br>
Travel  Date :
<input readonly name="traveldate" style="outline: none;background-color: transparent;" value="<%= request.getParameter("traveldate")%>">
<br><br> 
<label>   
Source :  
</label>   
<input readonly name="source" style="outline: none;background-color: transparent;" value="<%= request.getParameter("source")%>">  
 <br><br>
  Destination :  
</label>   
<input readonly name="destination" style="outline: none;background-color: transparent;" value="<%= request.getParameter("destination")%>">
  <br><br>
   <label>
Depature Time
<input readonly name="departuretime" style="outline: none;background-color: transparent;" value="<%= request.getParameter("departuretime")%>">
</label> <br><br>
 <label>
Arrival Time
<input readonly name="arrivaltime" style="outline: none;background-color: transparent;" value="<%= request.getParameter("arrivaltime")%>">
</label><br><br>

<label>   

 
  
<br> 
 
 <label for ="TicketFare">Ticket Fare :</label>
 <input  readonly name="ticketfare" id="ticketfare" style="outline: none;background-color: transparent;" value="<%= request.getParameter("ticketfare")%>"><br><br><br>
 
<label for ="totalticketfare">Total Ticket Fare:</label>
 <input readonly type ="text" name = "totalticketfare" value="" id="totalticketfare">
 </label>
 <input type="button" id="btn" value="Apply" onclick="generateTicketFare(); generateBill()" > 
 <br><br>
 <label for ="discountpercentage"> Discount % :</label>
 <input readonly type ="text" name = "discountpercentage" value="10" id="discountpercentage"><br><br><br>
 </label>
 <label for ="billamount"> Bill Amount :</label>
 <input readonly type ="text" name = "billAmount" value="" id="billamount"><br><br><br>
 </label>
 
<button type="submit" name="submit" value="Continue" >Continue</button>
 <br>
 <br> 
</form>  
</body>  
</html>
<!--  <script type="text/javascript">
      function answer()
      {
           var ans = document.getElementsByName('bookingtype');

for (var i = 0, length = ans.length; i < length; i++) {
    if (ans[i].checked) {
        if((ans[i].value)=="twoway")
        	document.getElementById("returndate").disabled = false;
        else
        	document.getElementById("returndate").disabled = true;
    }
}
      }
      
      
  function generateTicketFare() 
      {
                var numVal1 = Number(document.getElementById("passengernumber").value);
                var numVal2 = Number(document.getElementById("ticketfare").value);
               
               
                if(document.getElementById('oneway').checked == true) {   
                    var totalValue = (numVal1 * numVal2);
 
           } else {  
               var totalValue = 2*(numVal1 * numVal2);
  
           }  
                document.getElementById("totalticketfare").value = totalValue.toFixed(2);

            }
  function generateBill(){
	  
       var discount = Number(document.getElementById("discountpercentage").value);
        var totalTicketFare = Number(document.getElementById("totalticketfare").value);
        var x= (discount/100);
        var billAmount = (x*totalTicketFare);
        document.getElementById("billamount").value = billAmount.toFixed(2);

       
	  
  }
</script> -->