<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div>
		<span>
			<c:if test="${message != null }">
			${message}
			</c:if>
			<c:if test="${error != null }">
			${error}
			</c:if>
		</span>
	</div>
	<span> 
		<a href="<c:url value='/category/addcate' />">Add Category</a>
	</span>
	<table border="1" style="width:100%">
		<tr>
			<td>ID</td>
			<td>CateName</td>
			<td>Icon</td>
			<td>Action</td>
		</tr>
		<c:forEach var="i" items="${list}">
			<tr>
				<td>${i.cateId}</td>
				<td><a href ="<c:url value='/find?id=${i.cateId}' /> ">${i.cateName}</a></td>
				<td>${i.img}</td>
				<td><a href="<c:url value='/category/update?id=${i.cateId}' />">Update Category</a> || 
				<a href="<c:url value='/category/delete?id=${i.cateId}' />">delete</a>
			</tr>
		</c:forEach>
	</table>

</body>
</html>