$(document).ready(function () {
    listarCategoria();
});
function listarCategoria() {
    $.get("cat", {"opc": 1}, function (data) {
        let x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablita").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idcategoria + "</td><td>" + x[i].nombre + "</td><td><a href='#' onclick='read(" + x[i].idcategoria + ")'><i class='fa-solid fa-pen-to-square color1'></i></a></td><td><a href='#' onclick='eliminar(" + x[i].idcategoria + ")'><i class='fa-solid fa-trash-can color2'></i></a></td></tr>");
        }

    });
}

function guardarCategoria() {
    let titulo = $("#descripcion").val();
    let desc = $("#descripcion").val();
    $.cat("cat", {"titulo": titulo,"desc":desc,"pc": 2}, function (data) {
        bootbox.alert({
            message: "Categoria guardada correctamente...!",
            className: 'rubberBand animated'
        });
        limpiar();
        listarCategoria();
    });
    $("#guardar").modal('hide');
}