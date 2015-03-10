<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<center>
<form:form commandName="user" cssClass="form-horizontal">
	<div class="form-group">
		<label for="username" class="col-sm-2 control-label">Email:</label>
		<div class="col-sm-10">
			<form:input path="username" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<label for="password" class="col-sm-2 control-label">Password:</label>
		<div class="col-sm-10">
			<form:password path="password" cssClass="form-control" />
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-2">
			<input type="submit" value="Guardar" class="btn btn-primary btn-lg"/>
		</div>
	</div>
</form:form>
</center>