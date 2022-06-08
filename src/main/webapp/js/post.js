$(document).ready(function () {
    listarPost();
});
function listarPost() {
    $.get("post", {"opc": 1}, function (data) {
        let x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablita").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idpost + "</td><td>" + x[i].titulo + "</td><td>" + x[i].descripcion +
                    "</td><td><a href='#' onclick='read(" + x[i].idpost + ")'><i class='fa-solid fa-pen-to-square color1'></i></a></td><td><a href='#' onclick='eliminar(" + x[i].idpost + ")'><i class='fa-solid fa-trash-can color2'></i></a></td></tr>");
        }

    });
}
function guardar() {
    let titulo = $("#titulo").val();
    let desc = $("#descripcion").val();
    $.post("post", {"titulo": titulo, "desc": desc, "opc": 2}, function (data) {
        bootbox.alert({
            message: "Post guardado correctamente...!",
            className: 'rubberBand animated'
        });
        limpiar();
        listarPost();
    });
    $("#guardar").modal('hide');
}
function read(id) {
    $.get("post", {"id": id, "opc": 4}, function (data) {
        let w = JSON.parse(data);
        $("#edit_id").val(w.idpost);
        $("#edit_titulo").val(w.titulo);
        $("#edit_descripcion").val(w.descripcion);
    });
    $("#editar").modal('show');
}
function editar() {
    let id = $("#edit_id").val();
    let titulo = $("#edit_titulo").val();
    let desc = $("#edit_descripcion").val();
    bootbox.confirm({
        message: "Realmente desea Editar..?",
        buttons: {
            confirm: {
                label: 'SI',
                className: 'btn-success'
            },
            cancel: {
                label: 'NO',
                className: 'btn-danger'
            }
        },
        callback: function (result) {
            if (result) {
                $.get("post", {"id": id, "titulo":titulo, "desc":desc, "opc": 5}, function (data) {
                    bootbox.alert({
                        message: "Post Editado correctamente...!",
                        className: 'rubberBand animated'
                    });
                    limpiar();
                    listarPost();
                });
                $("#editar").modal('hide');
            } else {
                bootbox.alert({
                    message: "Post no Modificó!",
                    className: 'rubberBand animated'
                });
            }
        }
    });
}
function eliminar(id) {
    bootbox.confirm({
        message: "Realmente desea Eliminar..?",
        buttons: {
            confirm: {
                label: 'SI',
                className: 'btn-success'
            },
            cancel: {
                label: 'NO',
                className: 'btn-danger'
            }
        },
        callback: function (result) {
            if (result) {
                $.get("post", {"id": id, "opc": 3}, function (data) {
                    bootbox.alert({
                        message: "Post Eliminado correctamente...!",
                        className: 'rubberBand animated'
                    });
                    listarPost();
                });

            } else {
                bootbox.alert({
                    message: "Post no eliminado!",
                    className: 'rubberBand animated'
                });
            }
        }
    });
}
function limpiar() {
    $("#titulo").val("");
    $("#descripcion").val("");
}