<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<form action="update" method="post">
		<label>ID:</label>
		<input type="text" name="cateID" value="${cate.cateId}" readonly="readonly">
		<label>category ID:</label>
		<input type="text" name="cateName" value="${cate.cateName}">
		<label>Nhap Link icon:</label>
		<input type="text" name="images" value="${cate.img}">
		<input type="submit" value="update_category">
		
	</form>
</body>
</html>