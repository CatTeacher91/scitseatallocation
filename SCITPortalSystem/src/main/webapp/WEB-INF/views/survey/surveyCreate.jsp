<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>새 설문조사 작성</title>

	<script type="text/javascript" src="./resources/js/jquery-3.2.1.js"/></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script type="text/javascript" src="./resources/js/survey/surveyCreate.js"/></script>
	<link rel="stylesheet" type="text/css" href="./resources/css/survey/surveyCreate.css"/>
	
</head>
<body>
<div id="create">

<div id="target">
	<table>
		<tr>
		<td>Target:</td>
		<td>
			<select name="selectAlumni" id="selectAlumni">
			<option>Alumni</option>
			<option value="${alumni}">${alumni}기</option>
			</select>
		</td>
		<td>
			<select name="selectClass" id="selectClass">
			<option>Classroom</option>
			<option value="ALL">ALL</option>
			<c:forEach items="${classRoom}" var="cl">
			<option value="${cl}">${cl}</option>
			</c:forEach>
			</select>
		</td>
		<td>Start date:</td>
		<td>
		<input type="text" name="surveyStartDate" id="surveyStartDate">
		</td>
		<td>End date:</td> 
		<td>
		<input type="text" name="surveyEndDate" id="surveyEndDate">
		</td>
		</tr>
		<tr>
		<td>Title:</td>
		<td colspan="5">
		<input type="text" size="80" id="surveyTitle">
		</td>
		<td><input type="button" value="Save this" id="saveSurvey"></td>
		</tr>
	</table>
</div>

<div id="toolBar">
<p>Tool bar</p>
<div class="tools" id="singleinput">Single Input</div>
<div class="tools" id="radiogroup">Radiogroup</div>
<div class="tools" id="checkbox">Checkbox</div>
<div class="tools" id="dropdown">Dropdown</div>
<div class="tools" id="comment">Comment</div>
</div> 
 
<div id="editPage">
<p>Edit page</p>

<select id="pages">
<option value="page1">page1</option>
</select>

<input type="button" value="New page" id="addPage" onclick="javascript:addPage()">
<input type="button" value="Delete this page" id="subPage" onclick="javascript:subPage()">
</div>

<div id="surveyCanvas">
<div class="canvases" id="canvas1" style="z-index:1;">
<p>page1</p>
</div>
</div>

<div id="editSurvey">
<p>Edit Survey Option</p>
</div>

</div>
</body>
</html>