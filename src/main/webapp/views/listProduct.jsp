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
	<table border="1" style="width: 100%">
		<tr>

			<td>productID</td>
				<td>productName</td>
				<td>description</td>
				<td>$price</td>
				<td>$imageLink</td>
				<td>$cateID</td>
				<td>sellerID</td>
				<td>amount</td>
				<td>stoke2</td>
		
		</tr>
		<c:forEach var="i" items="${list}">
			<tr>
				<td>${i.prodId}</td>
				<td>${i.prodName}</td>
				<td>${i.des}</td>
				<td>${i.price}</td>
				<td>${i.img}</td>
				<td>${i.cateId}</td>
				<td>${i.sellerId}</td>
				<td>${i.amount}</td>
				<td>${i.stoke}</td>
				<td>
				<a href ='<c:url value="/category/update?id=${item.cateId}" /> '>Update</a> ||
				<a href ='<c:url value="/category/delete?id=${item.cateId}" /> '>Delete</a>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>