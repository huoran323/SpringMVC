<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="hello">测试</a>
	<a href="test">测试SpringMVC</a>
	
	<%-- <form action="test1" method="post">
		<input type="text" name="username" />
		<input type="submit" value="提交" />
	</form> --%>
	
	<%-- <form:form action="test1" method="post">
		<form:input path="username"/>
	</form:form> --%>
	
	<br>
	
	<a href="testException">测试异常</a>
	${exception }
	
	<br>
	
	<a href="testListener">测试监听器</a>
</body>
</html>