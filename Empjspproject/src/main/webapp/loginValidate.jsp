<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@page import="emp.dao.LoginDao"%>  
<jsp:useBean id="obj" class="emp.bean.User"/>  
<jsp:setProperty property="*" name="obj"/>  

<%  
boolean status = LoginDao.validate(obj);  
if (status) {  
	response.sendRedirect("login-success.jsp");  
} else {  
	response.sendRedirect("login-error.jsp"); 
%>    
<%  
}  
%>

</body>
</html>