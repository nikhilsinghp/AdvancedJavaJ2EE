<%@ page import = "java.util.ArrayList" %>
<%@ page import = "com.Employee" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% ArrayList<Employee> a1 = (ArrayList<Employee>) request.getAttribute("list"); %>

<table border = "2px">
<tr>
<th>ID</th>
<th>NAME</th>
<th>JOB</th>
<th>SALARY</th>
</tr>
<tr>
<% for(Employee e : a1) { %>

<tr>  

<td><%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getJob() %></td>
<td><%=e.getSalary() %></td>
</tr>

<% } %>
</table>

</body>
</html>