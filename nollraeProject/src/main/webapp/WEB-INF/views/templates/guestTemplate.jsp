<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>
	main {
		margin-bottom: 100px;
	}
</style>

<!-- TITLE(guest-tiles.xml) -->
<title><tiles:getAsString name="title"/></title>

<tiles:insertAttribute name="preScript"/>

</head>
<body class="w-full __variable_6eb640 font-pretendard" style="overflow: auto;">
<div id="__next">
	<!-- GUEST HEADER(guestHeader.jsp, guest-tiles.xml) -->
		<tiles:insertAttribute name="guestHeader"/>

	<!-- GUEST CONTENT(guest-tiles.xml) -->
		<tiles:insertAttribute name="content"/>

	<!-- GUEST FOOTER(guestFooter.jsp, guest-tiles.xml) -->
		<tiles:insertAttribute name="guestFooter"/>

	<tiles:insertAttribute name="postScript"/>
</div>
</body>
</html>