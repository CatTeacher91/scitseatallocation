<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../resources/css/news/newsRead.css"/>
<title>[해달 글 읽기]</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<br><br><br><br><br>
	<table>
		<tr>
		<th>
			<span class="page-header" style="border-left: 5px solid #7a1705; font-size:22px; font-weight:bold; font-family:inherit; margin-left:1%;" data-langnum="105">&nbsp 공지사항 확인</span>
		</th>
		</tr>
		<tr>
			<th id="newReadth">제목</th>
		</tr>
		<tr>
			<td id="newTd" height="50px" width="500px">${news.newsTitle}</td>
		</tr>
		<tr>
			<th id="newReadth">내용</th>
		</tr>
		<tr>
			<td id="newTd" height="300px" width="500px">${news.newsContent}</td>
		</tr>
		<tr>
			<th id="newReadfile">첨부파일</th>
		</tr>
		<tr>
			<td>
			<a href="download?newsNum=${news.newsNum}"> 
					${news.newsFileName}
			</a></td>
		</tr>
	</table>
	<br><br><br>
<%@ include file="../footer.jsp"%>
</body>
</html>