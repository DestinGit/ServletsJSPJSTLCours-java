<%--
    Document : Accueil.jsp
    Author : pascal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/ServletsJSPJSTLCours/css/Main.css" />
        <title>Accueil.jsp</title>
    </head>

    <body>

        <header>
            <%@ include file="Header.jsp" %>
        </header>

        <nav>
            <%@ include file="Nav.jsp" %>
        </nav>

        <article id="articleAccueil">
            <h1>Accueil</h1>
            <br>
            <label class="messageOrange">
                ${message}
            </label>
            <br><br>
            <img src="/ServletsJSPJSTLCours/images/champagne_rose.jpg" alt="Photo" title="Photo" width="300"/>
        </article>

        <footer>
            <%@ include file="Footer.jsp" %>
        </footer>

    </body>

</html>