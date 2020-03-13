<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>测试SourceTree</h1>
	<a href="testREST/1001">测试GET请求</a>
	<br/>
	
	<form action="testREST" method="post">
		<input type="submit" value="测试post" />
	</form>
	<br/>
	
	<form action="testREST" method="post">
		<!-- 对应服务端的PUT请求，需要是隐藏域，并且name值必须为_method,value为put，且form表单的提交方式为post，因为客户端只能提交post或put请求，不能提交PUT或DELETE请求 -->
		<input type="hidden" name="_method" value="put" />
		<input type="submit" value="测试put" />
	</form>
	<br/>
	
	<form action="testREST/1001" method="post">
		<input type="hidden" name="_method" value="delete" />
		<input type="submit" value="测试delete" />
	</form>
</body>
</html>