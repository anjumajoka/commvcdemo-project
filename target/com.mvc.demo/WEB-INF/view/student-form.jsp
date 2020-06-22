<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <title>
        Student Registration Form
    </title>
</head>
<body>
    <form:form action="showProcess" modelAttribute="student">

    first Name : <form:input path="firstName"/>
    <br><br>
    last Name : <form:input path="lastName"/>
    <br><br>
    <input type="submit" value="submit"/>
    </form:form>
</body>
</html>