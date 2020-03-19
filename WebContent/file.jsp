<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="down">下载图片</a>
	
	<br>
	
	<form action="up" method="post" enctype="multipart/form-data">
		头像：<input type="file" name="uploadFile" />
		描述：<input type="text" name="desc" />
		<input type="submit" value="上传" />
	</form>
</body>
</html>