<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.form.js"></script>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
</head>
<body>
<table>
	<tr>
		<td>序号</td>
		<td>会议编号</td>
		<td>会议名称</td>
		<td>开始日期</td>
		<td>结束日期</td>
		<td>会议类型</td>
		<td>创建时间</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list.list }" var="li">
		<tr>
			<td>${li.mid }</td>
			<td>${li.code }</td>
			<td>${li.mname }</td>
			<td>${li.start_time }</td>
			<td>${li.end_time }</td>
			<td>${li.tname }</td>
			<td>${li.create_time }</td>
			<td>
				<a href="selM?mid=${li.mid }">
				<input type="button" value="编辑">
			</a>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td>
			<a href="add.jsp">
				<input type="button" value="新增">
			</a>
		</td>
		<td colspan="7">
			<a href="meeting_list?pageNum=${list.prePage }">上一页</a>
			<a href="meeting_list?pageNum=1">1</a>
			<a href="meeting_list?pageNum=2">2</a>
			<a href="meeting_list?pageNum=3">3</a>
			<a href="meeting_list?pageNum=4">4</a>
			<a href="meeting_list?pageNum=5">5</a>
			<a href="meeting_list?pageNum=${list.nextPage }">下一页</a>
		</td>
	</tr>
</table>
</body>
</html>