<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addMinutes Page</title>

<script type="text/javascript" src="jquery-2.1.3.js"></script>
<script type="text/javascript">
	$(document).ready(
		function() {
			$.getJSON('<spring:url value="http://localhost:8080/fitnessApp/rest/activities/"/>', {
				ajax : 'true'
			}, function(data){
				var html = '<option value="">--Please select one--</option>';
				var len = data.length;
				for (var i = 0; i < len; i++) {
					html += '<option value="' + data[i].description + '">'
							+ data[i].description + '</option>';
				}
				html += '</option>';
				
				$('#type').html(html);
			});
			
		});
	
</script>
</head>
<body>
	<h1>Track your progress</h1>


	<spring:message code="minutes.language" />
	<a href="?language=en">English</a> |
	<a href="?language=it">Italian</a>

	<form:form commandName="exercise">
		<table>
			<tr>
				<td><spring:message code="minutes.text" /></td>
				<td><form:input path="minutes" /></td>
				<td><form:select id="type" path="type"></form:select></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>

	<br>Still to go: ${goal.minutes} minutes.


	<br>Enough for today, let's set my
	<a href="/fitnessApp/addGoal.html">next task.</a>





</body>
</html>