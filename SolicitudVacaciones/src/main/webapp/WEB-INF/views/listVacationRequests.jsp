<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="/WEB-INF/views/includes/includes.jsp" %>

<tiles:insertTemplate template="/WEB-INF/views/layout/layout.jsp">
	
	<tiles:putAttribute name="content-body">
		<div class="span9">
			<table class="table">
				<thead>
					<th>Nombre</th>
					<th>Fecha de inicio</th>
					<th>Fecha de fin</th>
				</thead>
				<tbody>
					<c:forEach items="${vacationRequests}" var="vacationRequest" varStatus="status">
					<tr>
						<td>
							${vacationRequest.employee.name}
						</td>
						<td> 
							<joda:format value="${vacationRequest.initialDate}" pattern="dd/MM/yyyy" />
						</td> 
						<td>
							<joda:format value="${vacationRequest.finalDate}" pattern="dd/MM/yyyy" />
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</tiles:putAttribute>

	<tiles:putAttribute name="content-script">
	</tiles:putAttribute>
</tiles:insertTemplate>