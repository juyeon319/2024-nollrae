<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- TITLE(guest-tiles.xml) -->
<title><tiles:getAsString name="title"/></title>

<tiles:insertAttribute name="preScript"/>

<style type="text/css">
</style>

<!-- GUEST CSS -->
<link href="<%=request.getContextPath()%>/resources/css/guestFooter.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/b2a5c0500639968f.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/d5ffef77c62fd5ac.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/50cce34ba8e82948.css" rel="stylesheet">

</head>
<body>
<div id="__next">
	<!-- GUEST HEADER(guestHeader.jsp, guest-tiles.xml) -->
	<header class="css-b8sb6r">
		<div class="css-p3zanw">
			<tiles:insertAttribute name="guestHeader"/>
		</div>
	</header>

	<!-- GUEST CONTENT(guest-tiles.xml) -->
	<main class="css-1xkde92">
		<tiles:insertAttribute name="content"/>
	</main>

	<!-- GUEST FOOTER(guestFooter.jsp, guest-tiles.xml) -->
	<footer class="css-9qom1h">
		<tiles:insertAttribute name="guestFooter"/>
	</footer>

	<tiles:insertAttribute name="postScript"/>
</div>
</body>
</html>


