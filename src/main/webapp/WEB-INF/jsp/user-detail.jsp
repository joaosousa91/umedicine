<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp" %>

<table  class="table table-bordered table-striped">

	<thead>
		<tr>
			<th>Username</th>
			<th>Password</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>${user.username}</td>
			<td>${user.password}</td>
		</tr>
	</tbody>

</table>