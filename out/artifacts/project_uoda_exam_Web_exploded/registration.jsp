<%--
  Created by IntelliJ IDEA.
  User: imran
  Date: 12/22/17
  Time: 12:32 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Sign Up</title>
</head>
<body>
<h1> User Sign Up</h1>

<h1>Registration Form</h1>
<form action="register" method="post"  enctype="multipart/form-data">
    <table cellpadding="3pt">
        <tr>
            <td>User Name :</td>
            <td><input type="text" name="userName" size="30" /></td>
        </tr>
        <tr>
            <td>User picture :</td>
            <td><input type="file" name="file" /></td>
        </tr>
        <tr>
            <td>Password :</td>
            <td><input type="password" name="password1" size="30" /></td>
        </tr>

        <tr>
            <td>Confirm Password :</td>
            <td><input type="password" name="password2" size="30" /></td>
        </tr>
        <tr>
            <td>email :</td>
            <td><input type="text" name="email" size="30" /></td>
        </tr>
        <tr>
            <td>Phone :</td>
            <td><input type="text" name="phone" size="30" /></td>
        </tr>
        <tr>
            <td>City :</td>
            <td><input type="text" name="city" size="30" /></td>
        </tr>
    </table>
    <p />
    <input type="submit" value="Register" />
</form>
</body>
</html>