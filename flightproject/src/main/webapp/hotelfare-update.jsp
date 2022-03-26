<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{  
  font-family: Calibri, Helvetica, sans-serif;  
}  
.container {  
    padding: 300px;  
      background-image: url("https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F28%2F2019%2F07%2Fkatikies-hotel-greece-78-BESTHOTELSWB19.jpg");

}  
  
  label{
color:white;
}
input[type=text], input[type=password], textarea {  
  width: 70%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
  margin-left:150px;
}  
input[type=text]:focus, input[type=password]:focus {  
  background-color: orange;  
  outline: none;  
}  
 div {  
            padding: 10px 0;  
         }  

img{
width:100px;
height:100px;
margin-left: 100px;
}
.updatebtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 10px 0;  
  border: none;  
  cursor: pointer;  
  width: 50%;  
  opacity: 0.9; 
  margin-left:240px; 
}  
  
</style>
</head>
<body>


<form action="update-hotel.html" method="post" name="hotel_form">  
  <div class="container">  
  <center>  <h1>UPDATE HOTEL </h1> </center>  <br><br>
  
 
<input type="text" name="hotelid" placeholder="Hotelid" size="15" required />   <br><br>

<input type="text" name="fare" placeholder="Roomfare per day" size="15" required />   <br><br>

    <button type="submit" class="updatebtn">Update Fare</button>    
</form>  
</body>
</html>