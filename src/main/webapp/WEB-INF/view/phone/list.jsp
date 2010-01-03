<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@ taglib prefix="spring"  uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form"    uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>List</title>
</head>
<body>
<div>
<a href="create" >Create</a>
</div>
<div>
	<form action="searh" method="get">
		<input type="text" name="stext" />
 		<input	type="submit" value="Search" />
	</form>
</div>
<table border="1" width="500">
	<tr>
		<td>id</td>
		<td>Name</td>
		<td>Phone</td>
	</tr>
	<c:forEach items="${listPhone}" var="item">
		<tr>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td>${item.phone} }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>