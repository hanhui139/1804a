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
<script type="text/javascript">
$(function(){
	$.post("selType",function(data){
		for ( var i in data) {
			$("#tid").append("<option name='tid' value='"+data[i].tid+"'>"+data[i].tname+"</option>")
		}
	})
})
</script>
<body>
	<form action="update" method="post">
		<input type="hidden" name="mid" value="${meet.mid }"> 
		会议编号：<input type="text" name="code" value="${meet.code }"><br>
		会议名称：<input type="text" name="mname" value="${meet.mname }"><br>
		会议日期：<input type="date" name="start_time" value="${meet.start_time }">至<input type="date" name="end_time" value="${meet.end_time }"><br>
		会议编号：
			<select id="tid" name="tid">
				
			</select><br>
		
		<input type="submit" value="修改">
	</form>
</body>
</html>