<%-- 
    Document   : prod
    Created on : 5 jun. 2022, 18:43:30
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
        <h1 class="mb-2">Productos</h1>
        <button class="btn btn-primary mb-2" data-toggle="modal" data-target="#guardar"><i class="fa-solid fa-plus"></i></button>
        <table class="table table-hover" id="tablita">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">ID</th>
                    <th scope="col">PRODUCTO</th>
                    <th scope="col">PRECIO</th>
                    <th scope="col">STOCK</th>
                    <th scope="col">CATEGORIA</th>
                    <th scope="col" colspan="2">ACCION</th>
                </tr>
            </thead>
            <tbody>                
            </tbody>
        </table>
        <!-- Guardar -->
        <div class="modal fade" id="guardar" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Nuevo Producto</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">Categoría:</label>
                                <select name="cat" id="categ" class="form-control">
                                    <option value="0">Seleccionar Categoría</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="message-text" class="col-form-label">Produccto:</label>
                                <input type="text" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="message-text" class="col-form-label">Precio:</label>
                                <input type="text" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="message-text" class="col-form-label">Cantidad:</label>
                                <input type="text" class="form-control">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" onclick="guardar()">Guardar Producto</button>
                    </div>
                </div>
            </div>
        </div>
        <!-- Editar -->
        <div class="modal fade" id="editar" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Update Post</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">Título:</label>
                                <input type="text" class="form-control" id="edit_titulo">
                                <input type="hidden" id="edit_id" value="0">
                            </div>
                            <div class="form-group">
                                <label for="message-text" class="col-form-label">Descripción:</label>
                                <textarea class="form-control" id="edit_descripcion"></textarea>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" onclick="editar()">Actualizar Post</button>
                    </div>
                </div>
            </div>
        </div>
        <%@include file="../WEB-INF/plantilla/footer.jspf" %>
        <script src="js/prod.js"></script>
    </body>
</html>
