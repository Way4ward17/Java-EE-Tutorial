<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
String name = request.getAttribute("name").toString();
out.print(name);
%>


${name} <br>

<%
String className= "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/student";
String username = "root";
String password = "";
String sql = "select * from data";
Class.forName(className);
Connection con = DriverManager.getConnection(url,username,password);
Statement pstmt = con.createStatement();
ResultSet rs = pstmt.executeQuery(sql);
rs.next();
%>

ID: <%=rs.getString(1) %>
Full name: <%=rs.getString(2) %>
Age: <%=rs.getString(3) %>
Gender: <%=rs.getString(4) %>


<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url = "jdbc:mysql://localhost:3306/student" user="root" password=""/>
<sql:query var = "rs" dataSource="${db}">select * from data</sql:query>
<c:forEach items="${rs.rows}" var="data">
<ul style="list-style-type:none;">
<li><c:out value = "${data.id}"></c:out> : <c:out value = "${data.name}"> </c:out> : <c:out value = "${data.age}"> </c:out> : <c:out value = "${data.gender}"></c:out>
</li>
</ul>

</c:forEach> 




<c:set var="str" value="Way4ward is a Java Developer"/>
Length : ${fn:length(str)}




</body>
</html>