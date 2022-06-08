<%-- 
    Document   : json
    Created on : 6 jun. 2022, 7:58:47
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
        <h1>JSON</h1>
        <button class="btn btn-danger" onclick="json()">JSON</button>
        <div class="container" id="respuesta">
        </div>
        <%@include file="../WEB-INF/plantilla/footer.jspf" %>
        <script src="js/json.js"></script>
    </body>
</html>
