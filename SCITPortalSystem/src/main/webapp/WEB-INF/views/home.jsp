<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>[HOME]</title>	
		<meta charset="UTF-8">	
		<!-- Javascript -->
		<link href="<c:url value ="resources/css/home.css"/>" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.2.1.js"/>"></script>
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
		<script src="http://malsup.github.com/jquery.cycle2.js"></script>	
	</head>

<body>
<%@ include file="header.jsp" %>
<br><br><br>

<!-- 여기에 내용 입력하면 됨 -->
<div class="slideDi" style="max-width:800px;margin-bottom:80px" align="center">
	 <div class="cycle-slideshow"  data-cycle-fx=scrollHorz data-cycle-timeout=2000  align="center" >
	    <img src="<c:url value="./resources/img/Jabrate.png"/>" style="width:90%">
	    <img src="<c:url value="./resources/img/preschool.jpg"/>" style="width:90%">		    
	    <img src="<c:url value="./resources/img/34th.jpg"/>" style="width:90%">
	</div>
</div>

<!-- 헤더 / 푸터 나눠서 include -->
<%@ include file="footer.jsp"%>
</body>
</html>


