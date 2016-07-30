<%@ page  contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
</head>
<style type="text/css">
	table td{
		border:1px solid green;	
		text-align:center;
	}
	
	.boldTd {
		font-weight:bold;
	}
</style>
<body style="align:center">
		<h2 style="text-align:center;">用户信息列表</h2>
		
		<table style="border:1px solid red;width:100%;">
			<tr>
				<td class="boldTd">姓名</td>
				<td class="boldTd">省份</td>
				<td class="boldTd">城市</td>
				<td class="boldTd">工作</td>
				<td class="boldTd">电话</td>
			</tr>
			<c:forEach var="user" items="${userList }">
				<tr>
					<td>${user.name }</td>
					<td>${user.province }</td>
					<td>${user.city }</td>
					<td>${user.job }</td>
					<td>${user.phone }</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
