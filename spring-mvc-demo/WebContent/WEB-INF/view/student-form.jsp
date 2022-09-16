<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		
		First Name: 
		<form:input path="firstName"/>
		<br><br>
		
		Last Name: 
		<form:input path="lastName"/>
		<br><br>
		
		
		Country: 
		<form:select path="country">
		<form:options items="${student.countryOptions}" />
		</form:select>
		<br><br>
		
		Favorite Language:
		<br>
		<form:radiobutton path="favoriteLg" value="Java"/> Java 
		<br>
		<form:radiobutton path="favoriteLg" value="C#"/> C# 
		<br>
		<form:radiobutton path="favoriteLg" value="Python"/> Python
		<br>
		<form:radiobutton path="favoriteLg" value="C++"/> C++
		<br>
		<form:radiobutton path="favoriteLg" value="JavaScript"/> JavaScript
		<br><br>
		
		Operating Systems:
		<br>
		<form:checkbox path="operatingSystems" value="MacOS"/> MacOS
		<br>
		<form:checkbox path="operatingSystems" value="Linux"/> Linux
		<br>
		<form:checkbox path="operatingSystems" value="Windows"/> Windows
		<br><br>
		<input type="submit" value="Submit">

	</form:form>
	

</body>
</html>