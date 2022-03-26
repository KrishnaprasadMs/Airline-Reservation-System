<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
* {
  margin: 0
}

.container {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  height: 100vh;
  background-color: #6699cc;
}

.container h1 {
  color: white;
  font-family: sans-serif;
  margin: 20px;
}

.registartion-form {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 600px;
  color: rgb(255, 255, 255);
  font-size: 18px;
  font-family: sans-serif;
  background-color: #154a68;
  padding: 20px;
}

.registartion-form input,
.registartion-form select,
.registartion-form textarea {
  border: none;
  padding: 5px;
  margin-top: 10px;
  font-family: sans-serif;
}

.registartion-form input:focus,
.registartion-form textarea:focus {
  box-shadow: 3px 3px 10px rgb(228, 228, 228), -3px -3px 10px rgb(224, 224, 224);
}

.registartion-form .submit {
  width: 100%;
  padding: 8px 0;
  font-size: 20px;
  color: rgb(44, 44, 44);
  background-color: #ffffff;
  border-radius: 5px;
}

.registartion-form .submit:hover {
  box-shadow: 3px 3px 6px rgb(255, 214, 176);
}

</style>
</head>
<body>
<div class="container">
  <h1>CANCEL TICKET</h1>
  <form name="registration" class="registartion-form" action="ticket-cancel-servlet.html" method="post">
    <table>
     
      <tr>
        <td><label for="bookingid">Booking ID :</label></td>
        <td><input type="text" name="bookingid" id="bookingid" placeholder="Enter Booking ID"></td>
      </tr>
      <tr>
        <td><label for="cancellationdate">Cancellation Date :</label></td>
        <td><input type="date" name="cancellationdate" id="cancellationdate"></td>
      </tr>
      <tr>
        <td><label for="reason">Reason For Cancellation:</label></td>
        <td><input type="textarea" name="reason" id="reason"></td>
      </tr>
       <tr>
        <td><label for="cancelid">Account Number  :</label></td>
        <td><input type="text" name="accountnumber" id="accountnumber" placeholder="Account Number"></td>
      </tr>
       <tr>
        <td><label for="ifsc">IFSC Code  :</label></td>
        <td><input type="text" name="ifsc" id="ifsc" placeholder="IFSC Code"></td>
      </tr>
      <tr>
        <td><label for="name">Account Holder Name :</label></td>
        <td><input type="text" name="name" id="name" placeholder="Account Holder Name"></td>
      </tr>
      
      <tr>
        <td colspan="2"><input type="submit" class="submit" value="Cancel" /></td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>