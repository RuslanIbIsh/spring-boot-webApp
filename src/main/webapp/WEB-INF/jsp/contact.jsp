<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Contact List - Sprign Boot Web Application Example</title>

</head>

<body >

<h1 align="center">My Contact list</h1>
<br/>


<table border="1" cellpadding="10">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach items="${contacts}" var="contact">
        <tr>

            <td> ${contact.name} </td>
            <td>${contact.email}</td>
            <td>${contact.country}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>