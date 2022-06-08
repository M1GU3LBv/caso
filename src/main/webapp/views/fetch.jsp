<%-- 
    Document   : fetch
    Created on : 6 jun. 2022, 8:55:40
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../WEB-INF/plantilla/head.jspf" %>
    </head>
    <body>
        <%@include file="../WEB-INF/plantilla/header.jspf" %>
        <h1>FETCH</h1>
        <button class="btn btn-warning" onclick="datos()">FETCH</button>
        <div class="container" id="respuesta">
        </div>
        <%@include file="../WEB-INF/plantilla/footer.jspf" %>
        <script src="js/fetch.js"></script>
    </body>
</html>
