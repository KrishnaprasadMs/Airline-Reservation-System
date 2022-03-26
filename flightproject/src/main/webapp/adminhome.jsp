<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Flight app</title>
	<link rel="stylesheet" href="view.css">
	<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
</head>
<body BACKGROUND="https://assets.gamepur.com/wp-content/uploads/2020/08/17104817/MSFS-1.jpg");
">

<div class="wrapper">
    <div class="sidebar">
        <h2>Flight app</h2>
        
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                   Flights
                    <span class="drawer__arrow"></span>
                </span>
                <ul class="drawer__content">
                  <li><a href="addFlightform.html">Add Flights</a></li>
                    <li><a href="view-by-admin.html">View Flights </a></li>
                    <li><a href="view-edit-delete.html">Edit Flights</a></li>
                     <li><a href="view-edit-delete.html">Delete Flights</a></li>
                </ul>
        </div>
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name"><a href ="hotel.html">Hotels</a>
                    
                    <span class="drawer__arrow"></span>
                </span>
                <ul class="drawer__content">
                    <li><a href="hotel.html">Check Hotels</a></li>
                </ul>
        </div>
        
       
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                   User Profile
                    <span class="drawer__arrow">  </span>
                </span>
                <ul class="drawer__content">
                
                     <li><a href="user-data-view.html">View User Details</a></li>
                   
                </ul>
        </div>
        <div class="drawer">
            <input type="checkbox">
                <span class="drawer__name">
                  Booking
                    <span class="drawer__arrow">></span>
                </span>
                <ul class="drawer__content">
                
                     <li><a href="booking-view-servlet.html">Booking Details</a></li>
                   
                </ul>
        </div>
        
       
    </div>
</div>
<div class="topnav">
    <a href="Home.html">Logout</a>
</div>
<div class="body_content">
    <h2>Welcome </h2>
</div>
</body>
</html>