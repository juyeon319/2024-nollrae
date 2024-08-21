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

<!-- GUEST CSS -->
<link href="<%=request.getContextPath()%>/resources/css/entry.b469cb78.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/GnbOnly.bb9ce532.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/index.4ce75fae.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/index.59c13e07.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/swiper-vue.b5b61d6c.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/Header.e4df2b16.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/index.446d509f.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/index.f898286a.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/50cce34ba8e82948.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/b2a5c0500639968f.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/d5ffef77c62fd5ac.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/guestFooter.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/resources/css/notice.css" rel="stylesheet">

</head>
<body>
<div id="__nuxt">
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


