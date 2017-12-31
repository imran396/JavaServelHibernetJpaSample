
<%--
  Created by IntelliJ IDEA.
  User: imran
  Date: 12/21/17
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<table width="100%">
    <thead>
    <th>Sid</th>
    <th>Name</th>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.userName}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<form action="/logout" method="post">
    <input type="submit" value="Logout" >
</form>

</body>
</html>
