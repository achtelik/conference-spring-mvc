<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title><spring:message code="labels.conference_center"/></title>
</head>
<body>
<h1><spring:message code="labels.welcome_to"/> ${conference_name}</h1>
<a href="/registration">Registration</a>
</body>
</html>