<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="param" method="post">
		username: <input type="text" name="username" /><br/>
		password: <input type="text" name="password" /><br/>
		age: <input type="text" name="age" /><br/>
		<!-- address.province对应user bean中的属性名 -->
		province: <input type="text" name="address.province" /><br/>
		city: <input type="text" name="address.city" /><br/>
		country: <input type="text" name="address.country" /><br/>
		<input type="submit" value="添加"/>
	</form>
</body>
</html>