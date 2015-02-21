<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"   %>
<%@taglib  prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addMinutes Page</title>

<script type="text/javascript" src="jquery-2.1.3.js"></script>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$
								.getJSON(
										'<spring:url value="http://localhost:8080/fitnessApp/activities/"/>',
										{
											ajax : 'true'
										},
										function(data) {
											var html = '<option value="">--Please select one--</option>';
											var len = data.length;
											for (var i = 0; i < len; i++) {
												html += '<option value="' + data[i].description + '">'
														+ data[i].description
														+ '</option>';
											}
											html += '</option>';
											$('#type').html(html);
										});
					});
</script>

<style>
.error {
	color: #ff0000;
}

.errorBlock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
	<h1>
		<spring:message code="minutes.track" />
	</h1>

	<spring:message code="minutes.language" />
	<a href="?language=en">English</a> |
	<a href="?language=it">Italian</a>

	<form:form commandName="exercise">
		<table>
			<tr>
				<td><spring:message code="minutes.text" /></td>
				<td><form:input path="minutes" /></td>
				<td><form:errors path="minutes" cssClass="error" /></td>
			</tr>
			<tr>
							<td><spring:message code="minutes.selectActivity" /></td>
				<td colspan="2"><form:select id="type" path="type"></form:select></td>
				<td><form:errors path="type" cssClass="error" /></td>
			</tr>
			<tr>
				<spring:message code="minutes.add" var="addVar" />
				<td colspan="2"><input type="submit" value="${addVar}" /></td>
			</tr>
		</table>
	</form:form>

	<br>
	<spring:message code="minutes.toGo" />
	: ${goal.minutes}
	<spring:message code="minutes.minutes" />
	.
	<br>
	<spring:message code="minutes.nextTask" />
	<a href="/fitnessApp/addGoal.html">next task.</a>


</body>
</html>