$(document).ready(function () {
    listarProducto();
    listarCategoria2();
});
function listarProducto() {
    $.get("prod", {"opc": 1}, function (data) {
        let x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablita").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idproducto + "</td><td>" + x[i].producto+ "</td><td>" + x[i].precio+ "</td><td>"+ x[i].stock+ "</td><td>" + x[i].categoria+ "</td><td><a href='#' onclick='read(" + x[i].idproducto + ")'><i class='fa-solid fa-pen-to-square color1'></i></a></td><td><a href='#' onclick='eliminar(" + x[i].idproducto + ")'><i class='fa-solid fa-trash-can color2'></i></a></td></tr>");
        }

    });
}
function listarCategoria2() {
    $.get("cat", {"opc": 1}, function (data) {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {
            $("#categ").append("<option value='"+x[i].idcategoria+"'>"+x[i].nombre+"</option>");
        }

    });
}

