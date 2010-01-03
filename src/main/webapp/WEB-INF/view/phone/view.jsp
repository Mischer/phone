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
<title>View</title>
</head>
<body>
<table>
	<tr>
		<td>Id</td>
		<td><c:out value="${phone.id}" /></td>
	</tr>
	<tr>
		<td>Name</td>
		<td><c:out value="${phone.name}" /></td>
	</tr>
	<tr>
		<td>Phone</td>
		<td><c:out value="${phone.phone}" /></td>
	</tr>
</table>
</body>
</html>