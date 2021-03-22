<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title><spring:message code="labels.registration"/></title>
</head>
<body>
<h1>Registration</h1>
<form:form modelAttribute="registrationDto">
    <table>
        <tr>
            <td>
                <div><spring:message code="labels.name"/>:</div>
            </td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <spring:message code="buttons.save" var="buttons_save"/>
                <input type="submit" value="${buttons_save}"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>