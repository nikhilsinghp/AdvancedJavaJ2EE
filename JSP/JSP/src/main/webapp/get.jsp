
<%@page import="com.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Employee e = (Employee) request.getAttribute("emp");
%>
<table border = "2px">
<tr>
<th>ID</th>
<th>NAME</th>
<th>JOB</th>
<th>SALARY</th>
</tr>
<tr>
<td><%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getJob() %></td>
<td><%=e.getSalary() %></td>
</tr>
</table>

</body>
</html>