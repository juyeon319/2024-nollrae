<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div>
	<table border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>글제목</th>
				<th>문의날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:set var="qnaList" value="${qnaList }" />
				<c:if test="${empty qnaList }">
					<tr>
						<td colspan="4">글없음</td>
					</tr>
				</c:if>
				<c:if test="${not empty qnaList }">
					<c:forEach items="${qnaList }" var="list">
						<tr>
							<td>${list.qnaNo }</td>
							<td>${list.qnaTitle }</td>
							<td>${list.qnaDate }</td>
						</tr>
					</c:forEach>
				</c:if>
		</tbody>
	</table>
</div>