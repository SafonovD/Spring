
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Student Information</h2>
<form:form method = "POST" action = "/addCar">
    <table>
        <tr>
            <td><form:label path = "name">Name</form:label></td>
            <td><form:input path = "name" /></td>
        </tr>
        <tr>
            <td><form:label path = "color">Color</form:label></td>
            <td><form:input path = "color" /></td>
        </tr>
        <tr>
            <td><form:label path = "engine">Engine</form:label></td>
            <td><form:input path = "engine" /></td>
        </tr>
        <tr>
            <td><form:label path = "id">id</form:label></td>
            <td><form:input path = "id" /></td>
        </tr>
        <tr>
            <td>
                <input type = "submit" value = "ОК"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
