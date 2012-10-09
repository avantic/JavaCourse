<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/includes/includes.jsp" %>

<tiles:insertTemplate template="/WEB-INF/views/layout/layout.jsp">
	
	<tiles:putAttribute name="content-body">
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
	</tiles:putAttribute>

	<tiles:putAttribute name="content-script">
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
	</tiles:putAttribute>
</tiles:insertTemplate>