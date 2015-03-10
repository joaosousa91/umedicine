<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<table class="table table-bordered table-striped">
	<thead>
		<tr>
			<th>Número Processo</th>
			<th>Nome Paciente</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${patients}" var="patient">
			<tr>
				<td><a href="<spring:url value="/patients/${patient.nprocesso}.html" />">
						${patient.nprocesso} </a></td>
				<td>${patient.nomePaciente} </td>
			</tr>
		</c:forEach>
	</tbody>
</table>