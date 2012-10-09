<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/includes/includes.jsp" %>

<%@ page session="false" %>
 
<html>
	<head>
		<c:set var="URL_PREFIX" value="${pageContext.request.contextPath}" /> 
		
		<link type="image/x-icon" href="${URL_PREFIX}/resources/images/favicon.ico" rel="shortcut icon">
		
 		<link type="text/css" href="${URL_PREFIX}/resources/bootstrap/css/bootstrap.css" rel="stylesheet" >
 		<link type="text/css" href="${URL_PREFIX}/resources/bootstrap/css/bootstrap-responsive.css" rel="stylesheet" >
 		<link type="text/css" href="${URL_PREFIX}/resources/datepicker/css/datepicker.css" rel="stylesheet" >
 		
 		<style type="text/css">
			body {
				padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
			}
		</style>
	</head>
	
	<body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container-fluid"> 
					<a class="brand" href="#">Solicitud de vacaciones</a>
				</div>
			</div>
		</div>
	
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span3">
					<div class="well sidebar-nav">
						<ul class="nav nav-list">
							<li class="nav-header">Vacaciones</li>
							<li><a href="${pageContext.request.contextPath}/listVacationRequests">Solicitudes pendientes</a></li>
							<li class="active"><a href="${pageContext.request.contextPath}/vacationRequest">Solicitar vacaciones</a></li>				
						</ul>
					</div>
				</div>
				
				<tiles:insertAttribute name="content-body" ignore="true" />
			</div>
	
			<hr>
	
			<footer>
			<p>&copy; Avantic 2012</p>
			</footer>
	
		</div>
		<!--/.fluid-container-->
		
		
		<script src="http://code.jquery.com/jquery-latest.js"></script>
    	<script src="${URL_PREFIX}/resources/bootstrap/js/bootstrap.min.js"></script>
    	<script src="${URL_PREFIX}/resources/datepicker/js/bootstrap-datepicker.js"></script>
    	
    	<tiles:insertAttribute name="content-script" ignore="true" />
	</body>
</html>