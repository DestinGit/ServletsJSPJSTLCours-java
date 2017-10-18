<%--
    Document   : Pays.jsp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pays</title>
    </head>

    <body>
        <c:forEach var="pays" items="${listePays}">
            [${pays.idPays}] ${pays.nomPays}<br>
        </c:forEach>
        <br>
        ${message}
    </body>
</html>