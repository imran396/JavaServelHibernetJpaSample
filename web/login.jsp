<%--
  Created by IntelliJ IDEA.
  User: imran
  Date: 12/19/17
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<p style="color: red;">${errorMessage}</p><br><br>
<form action="/success" method="post">

    <div>
        <label>Username</label>
        <input type="text" name="username" autocomplete="off">
        <br>
        <br>
        <label>Password</label>
        <input type="password" name="password" autocomplete="o">
        <br>
        <br>
        <input type="submit" name="loginsubmit">
    </div>

</form>
</body>
</html>
