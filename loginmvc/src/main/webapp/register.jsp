<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register your details</title>
</head>
<body style="text-align: center">
<form action="add" method="post">
<b>

<label for="name">Name</label>
<input type="text" name="name" placeholder="Enter your name" required><br><br>

<label for="userId">UserId</label>
<input type="number" name="userId" placeholder="Enter your userId" required><br><br>

<label for="Mobile No">Mobile No</label>
<input type="number" name="mobileNo" placeholder="Enter your contactNo" maxlength="10" required="required"><br><br>

<label for="email">EmailId</label>
<input type="email" name="email" placeholder="Email to contact online" required><br><br>

<label for="password">Password</label>
<input type="password" name="password" placeholder="Enter your secret key" required><br><br>

<input type="submit" value="Register">

</b>
</form>
</body>
</html>