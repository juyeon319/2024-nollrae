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

<!-- GUEST CSS -->
<link href="<%=request.getContextPath()%>/resources/css/entry.b469cb78.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/GnbOnly.bb9ce532.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/index.4ce75fae.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/index.59c13e07.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/swiper-vue.b5b61d6c.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/Header.e4df2b16.css" rel="stylesheet">

</head>
<body>
<div id="__next">
	<!-- GUEST HEADER(guestHeader.jsp, guest-tiles.xml) -->
	<header class="css-b8sb6r">
		<tiles:insertAttribute name="guestHeader"/>
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


