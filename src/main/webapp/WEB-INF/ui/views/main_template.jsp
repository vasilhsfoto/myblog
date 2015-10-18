<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta charset="utf-8">
		<title>the name of the article</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<link rel="stylesheet" type="text/css" href="http://127.0.0.1:8080/myblog/css/bootstrap.min.css">
	</head>

<body>
	<tiles:insertAttribute name="header"/>

		<div id=body class="container">
			<div class="row">

				<!--1st column: main content-->
				<tiles:insertAttribute name="main-content"/>

				<!-- 2nd column with widget -->
				<div class="col-md-3" style="background-color: white">

					<div class="well text-center" style="margin-top: 57px">
						Subscribe Here for receiving blog updates
						<button class="btn btn-success btn-lg">Subscribe to my feed</button>
					</div>

					<div class="panel panel-default" style = "margin-top: 30%;">
					    <div class="panel-heading">
					        <h5 class="panel-title">Recent Posts</h5>
					    </div>

						<ul class="list-group">
							<li class="list-group-item"><a href="singlepost.html">1. Aries Sun Sign March </a></li>
							<li class="list-group-item"><a href="singlepost.html">1. Aries Sun Sign March </a></li>
							<li class="list-group-item"><a href="singlepost.html">1. Aries Sun Sign March</a></li>
							<li class="list-group-item"><a href="singlepost.html">1. Aries Sun Sign March </a></li>
							<li class="list-group-item"><a href="singlepost.html">1. Aries Sun Sign March</a></li>
						</ul>

					</div>

					<div class="panel panel-default"  style = "margin-top: 30%;">
					    <div class="panel-heading">
					        <h5>Tags</h5>
					    </div>
					    <div class="panel-body">
					        <ul class="list-inline">
					            <c:forEach var="tag" items="${tags}">
						            <li><a href="#"><BIG>${tag.tagName}</BIG></a></li>
					            </c:forEach>
					        </ul>
					    </div>
					</div>

				</div>
			</div>
		</div>

	<tiles:insertAttribute name="footer"/>
</body>

</html>