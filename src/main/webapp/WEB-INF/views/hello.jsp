<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<body>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
        <th>Operations</th>
    </tr>

    <c:forEach var="person" items="${allPersons}">

        <c:url var="updateButton" value="/update">
            <c:param name="personId" value="${person.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/delete">
            <c:param name="personId" value="${person.id}"/>
        </c:url>

    <tr>
        <td>${person.name}</td>
        <td>${person.surname}</td>
        <td>${person.age}</td>
        <td>
            <input type="button" value="Update" onclick="window.location.href = '${updateButton}'">
            <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'">

        </td>
    </tr>
    </c:forEach>

</table>
<br>
<input type="button" value="Add" onclick="window.location.href = 'new'"/>

</body>
</html>
