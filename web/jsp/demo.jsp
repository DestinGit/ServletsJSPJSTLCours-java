<%-- 
    Document   : demo
    Created on : 18 oct. 2017, 09:31:35
    Author     : formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- JSTL : Variables, structures de contrôles --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- JSTL : Autres fonctions de EL (Expressions Language) Traitements de chaînes …--%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%-- JSTL : Formatage des données --%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%-- JSTL : SQL --%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%-- JSTL : Traitements XML --%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:forEach var="element" items="${param}" >
            <c:out value="${element.key}" /> :
            <c:out value="${element.value}" />
            <br/>
        </c:forEach>
        <br/>
    </c:forEach>

</body>
</html>
