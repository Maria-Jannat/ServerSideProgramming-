<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Welcome...</h2>
        <c:if test="${empty sessionScope['loginUser']}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <a href="login.jsp">Logout
            <c:out value="${sessionScope['loginUser']}"/>
        </a>
    </body>
</html>
