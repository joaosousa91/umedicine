<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp" %>

<table  class="table table-bordered table-striped">

	<thead>
		<tr>
			<th>Número Processo</th>
			<th>Nome Paciente</th>
			<th>Raça</th>
			<th>Data Nascimento</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>${patient.nprocesso}</td>
			<td>${patient.nomePaciente}</td>
			<td>${patient.raca}</td>
			<td>${patient.dataNascimento}</td>
		</tr>
	</tbody>

</table>