<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tables</title>
</head>
<body>
<table border="1" width="70%">
<tr>
<th>Sid Number</th>
<th>Student Name</th>
<th>Age</th>
</tr>
<c:forEach var="current" items="${students}">
<tr>
<td><c:out value="${current.sid}"></c:out></td>
<td><c:out value="${current.sname}"></c:out></td>
<td><c:out value="${current.age}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>