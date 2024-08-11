<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div class="container">
		<table>
			<thead>
				<tr>
					<th>글번호</th>
					<th>글제목</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:set var="noticeList" value="${noticeList}" />
					<c:if test="${empty noticeList}">
						<tr>
							<td colspan="3">글없음</td>
						</tr>
					</c:if>
					<c:if test="${not empty noticeList}">
						<c:forEach items="${noticeList}" var="list">
							<tr>
								<td>${list.ntcNo}</td>
								<td><a href="<%=request.getContextPath()%>/guest/noticeDetail/${list.ntcNo}">
									${list.ntcTitle}</a></td>
								<td>${list.ntcCnt}</td>
							</tr>
						</c:forEach>
					</c:if>
			</tbody>
		</table>
	</div>
</body>
</html>
