<!--1st column: main content-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="col-md-9" style="background-color: white">
	<h1> Latest Posts </h1>

	<!-- List of top x articles displayed -->
	<c:forEach var="article" items="${articles}">
		<c:out value="${article.articleHtml}" escapeXml="false"></c:out>
	</c:forEach>

	<!-- Pagination -->
	<ul class="pager">
		<li class="previous"> <a href="#">←Previous</a></li>
		<li class="next"> <a href="#">Next→</a></li>
	</ul>

</div>
