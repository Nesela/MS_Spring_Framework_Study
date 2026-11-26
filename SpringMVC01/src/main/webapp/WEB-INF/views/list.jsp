<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
	<script src="${pageContext.request.contextPath}/resources/js/test.js"></script>
</head>
<body>

	<h1>list</h1>

	<table border="1">
		<colgroup>
			<col width="50"/>
			<col width="100"/>
			<col width="300"/>
			<col width="100"/>
		</colgroup>
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td colspan="4" align="center">----------작성된 글이 없습니다----------</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.id }</td>
						<td>${dto.writer }</td>
						<td><a href="detail.do?id=${dto.id }">${dto.title }</a></td>
						<td>${dto.createAt }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="글 작성" onclick="location.href='insertform.do'"/>
			</td>
		</tr>
	</table>

</body>
</html>














