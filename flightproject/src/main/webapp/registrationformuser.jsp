<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
    
        <title>Airline Reservation Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel = "stylesheet" type = "text/css" href = "login.css" />
     <!--    <script type="text/javascript" src="registervalidation.js"></script> --> 
    </head>
    
    <style>
    
    body {
	background-image:
		url("https://assets.gamepur.com/wp-content/uploads/2020/08/17104817/MSFS-1.jpg");
}
    
    </style>
    <body>
       
 
	<div class="login">
            <div class="login-screen">
                <form  action = "user-login-servlet.html" method="post" id="formregister"  name="registration" >
                    <div class="app-title">
			<h1>Register</h1>
                    </div>
                    
                    <div class="login-form">
                     <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="Full Name" id="fullname" name="fullname">
                            <label class="login-field-icon fui-key" for="fullname"></label>
                        </div>
                         <div class="control-group">
                            <input type="email" class="login-field" value="" placeholder="Email" id="email" name="email">
                            <label class="login-field-icon fui-user" for="email"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="phonenumber" id="phonenumber" name="phonenumber">
                            <label class="login-field-icon fui-user" for="phonenumber"></label>
                        </div>
                        
                       
                        
                        <div class="control-group">
                            <input type="password" class="login-field" value="" placeholder=" Set Password" id="password" name="password">
                            <label class="login-field-icon fui-lock" for="login-pass"></label>
                        </div>
                        
                        <div class="control-group">
                            <input type="text" class="login-field" value="" placeholder="confirmpassword" id="confirmpassword" name="confirmpassword">
                            <label class="login-field-icon fui-phone" for="confirmpassword"></label>
                        </div>
                        
                       
                        <input class="btn btn-primary btn-large btn-block" type="submit" value="Register" >
                        
                    </div>
                </form>
            </div>
	</div>
    </body>
</html>
<script type="text/javascript">
function validate() {    
    var fullname = document.registration.fullname;    
    
    var email = document.registration.email;    
    var phonenumber = document.registration.phonenumber;    
    var password = document.registration.password;    
    var confirmpassword = document.registration.confirmpassword;    
    

    if (fullname.value.length <= 0) {    
        alert("Name is required");    
        fullname.focus();    
        return false;    
    }    
    if (email.value.length <= 0) {    
        alert("Email id is required");    
        email.focus();    
        return false;    
    }    
    if (phonenumber.value.length <= 0) {    
        alert("Mobile number is required");    
        phonenumber.focus();    
        return false;    
    }   
    if (password.value.length <= 0) {    
        alert("type password");    
        password.focus();    
        return false;    
    }  
    if (confirmpassword.value.length <= 0) {    
        alert("type confirm password");    
        confirmpassword.focus();    
        return false;    
    }  
    if (confirmpassword.value.length != password.value.length) {    
        alert("confirm password not matches password");    
        confirmpassword.focus();    
        return false;    
    }  
    
      
   
    return true;    
}    
</script>



