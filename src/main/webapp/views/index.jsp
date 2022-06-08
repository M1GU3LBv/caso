<%-- 
    Document   : index
    Created on : 5 jun. 2022, 18:21:31
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <%@include file="../WEB-INF/plantilla/head.jspf" %>
        <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body>
        <%@include file="../WEB-INF/plantilla/header.jspf" %>
        <div class="container d-flex pt-3 justify-content-between">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Categoría</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <a href="menu?op=1" class="btn btn-primary">Categoría<i class="fa-solid fa-cubes-stacked ml-2"></i></a>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Producto</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <a href="menu?op=2" class="btn btn-primary">Producto<i class="fa-solid fa-cubes ml-2"></i></a>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Post</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <a href="menu?op=3" class="btn btn-primary">Post<i class="fa-solid fa-file-lines ml-2"></i></a>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">JSON</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <a href="menu?op=4" class="btn btn-primary">JSON<i class="fa-solid fa-message ml-2"></i></a>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">AJAX</h5>
                    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                    <a href="menu?op=5" class="btn btn-primary">AJAX<i class="fa-solid fa-message ml-2"></i></a>
                </div>
            </div>
        </div>

        <%@include file="../WEB-INF/plantilla/footer.jspf" %>
    </body>
</html>
