<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



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


</body>
</html>