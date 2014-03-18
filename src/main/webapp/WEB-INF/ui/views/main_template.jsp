<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>everything's about java and related technologies</title>
		<link rel="stylesheet" href="http://www.rlsbb.com/wp-content/themes/eos/style.css" type="text/css" media="screen" />
	
		<script type="text/javascript" src="http://www.rlsbb.com/wp-content/themes/eos/default.js"></script>

		<link rel='stylesheet' id='cptchStylesheet-css'  href='http://www.rlsbb.com/wp-content/plugins/captcha/css/style.css?ver=3.7.1' type='text/css' media='all' />
		<link rel="EditURI" type="application/rsd+xml" title="RSD" href="http://www.rlsbb.com/xmlrpc.php?rsd" />
		<link rel="wlwmanifest" type="application/wlwmanifest+xml" href="http://www.rlsbb.com/wp-includes/wlwmanifest.xml" /> 
	</head>

	<body>
		<c:out value="${posts}"></c:out>	
		<c:out value="${tags}"></c:out>
	</body>

</html>