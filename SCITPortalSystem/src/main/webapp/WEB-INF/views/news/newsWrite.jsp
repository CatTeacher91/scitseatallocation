<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="../resources/css/news/newsWrite.css"/>
	<link href="<c:url value ="/resources/css/mainMenu.css"/>" rel="stylesheet" type="text/css" />	
	<script type="text/javascript">
		function formCheck(){
			var title = document.getElementById('newsTitle');
			var content = document.getElementById('newsContent');
		
			if (title.value == '') {
				alert('제목을 입력해 주세요.');
				return false;
			}
			if (content.value == '') {
				alert('내용을 입력해 주세요.');
				return false;
			}
			return true;
		}
		$("#upload").change(function() {
			readURL(this);
		});
	</script>
	<title>[문의하기]</title>
	</head>	
	<body>
	<%@ include file="../header.jsp" %>
	<br><br><br><br><br>
	<form action="insertNewsWrite" method="post" enctype="multipart/form-data" onsubmit="return formCheck();">
		<table>
			<tr>
			<th></th>
			<td>
				<span class="page-header" style="border-left: 5px solid #7a1705; font-size:22px; font-weight:bold; font-family:inherit; margin-left:1%;" data-langnum="105">&nbsp 공지사항 작성</span>
			</td>
		</tr>
			<tr>
				<th id="newWriteTh">제목</th>
				<td><input id="newWriteinput" type="text" id="newsTitle" name="newsTitle"></td>
			</tr>
			<tr>
				<th></th>
				<td>
				<input id="WritecheckBox" type="checkbox" id="newsHeader" name="newsHeader" value="중요">중요
					<select id="WriteSelect" name="writeAlumni">
							<option value="0">전체공지</option>
							<option value="34">34기</option>
							<option value="35">35기</option>
						</select>
						<select id="WriteSelect" name="writeClass">
							<option value="Z">--</option>
							<option value="A">A반</option>
							<option value="B">B반</option>
							<option value="C">C반</option>
							<option value="D">D반</option>
						</select>
				</td>
			</tr>
			<tr>
				<th id="newWriteTh">내용</th>
				<td><textarea id="newWritetextarea" name="newsContent" rows="5" cols="40"></textarea></td>
			</tr>
			<tr>
				<th id="newWriteTh">첨부파일</th>
				<td>
					<input type="file" name="upload">
				</td>
			</tr>
				
		</table>
		<div style="width: 50px; height: 50px; margin: auto;" id="submitDiv">
			<input id="button" type="submit" value="저장">
		</div>		
	</form>	
	<br><br><br>
	<%@ include file="../footer.jsp"%>
	</body>
</html>