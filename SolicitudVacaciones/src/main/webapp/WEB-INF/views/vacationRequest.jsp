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
							<li class="active"><a href="#">Solicitar vacaciones</a></li>
							<li><a href="#">Solicitudes pendientes</a></li>
							<li><a href="#">Link</a></li>
							<li><a href="#">Link</a></li>							
						</ul>
					</div>
				</div>
				
				<div class="span9">
					<form:form class="form-horizontal" commandName="doVacationRequestCommand">
						<legend>Formulario de solicitud</legend>
						<div class="control-group">
							<label class="control-label" for="inputName">Nombre</label>
							<div class="controls">
								<form:input type="text" id="name" path="name" placeholder="Nombre y apellidos" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="inputEmail">Email</label>
							<div class="controls">
								<form:input type="text" id="mail" path="mail" placeholder="Email" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="inputInitialDate">Fecha de inicio</label>
							<div class="controls">
								<div class="input-append date" id="dp1" data-date="09/10/2012" data-date-format="dd/mm/yyyy">
									<form:input id="initialDate" path="initialDate" maxlength="10" cssClass="input-medium" placeholder="dd/mm/aaaa"/>
									<span class="add-on"><i	class="icon-calendar"></i></span>
								</div>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="inputFinalDate">Fecha de fin</label>
							<div class="controls">
								<div class="input-append date" id="dp2" data-date="09/10/2012"
									data-date-format="dd/mm/yyyy">
									<form:input id="finalDate" path="finalDate" maxlength="10" cssClass="input-medium" placeholder="dd/mm/aaaa"/>
									<span class="add-on"><i	class="icon-calendar"></i></span>
								</div>
							</div>
						</div>
						<div class="control-group">
							<div class="controls">
								<button type="submit" class="btn">Solicitar</button>
							</div>
						</div>
					</form:form>
				</div>
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
    	
    	<script>
    		$(function() {
    			$('#dp1').datepicker()
    				.on('changeDate', function(ev) {
    					$('#dp1').datepicker('hide');
    				});
    			$('#dp2').datepicker()
    				.on('changeDate', function(ev) {
    					$('#dp2').datepicker('hide');
    				});;
    		});
    	</script>
	</body>
</html>