<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Igor
  Date: 20.07.2021
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>

<html lang="en">
<head>
    <title>New</title>
</head>
<body>

<form:form action="save" modelAttribute="person">

 <form:hidden path="id"/>

   Please Enter person name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Please Enter person surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Please Enter person age <form:input path="age"/>
    <form:errors path="age"/>
    <br>
    <input type="submit" value="Ok">

</form:form>
</body>
</html>
