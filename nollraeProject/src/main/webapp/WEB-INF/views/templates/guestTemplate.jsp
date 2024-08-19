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
<link href="<%=request.getContextPath()%>/resources/css/969f60bdd3700d13d4b9df8937fcc8745bbfa45b.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/d38a9d874d4c4bac6c489442cef0c7135425d51c.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/dc32f6b7.b9ca6854.chunk.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/bui-react-10.fbd3f9fd.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/bui-react-10.76b1441a.css" rel="stylesheet">

</head>
<body>
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
</body>
</html>


