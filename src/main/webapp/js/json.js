$(document).ready(function (){
    
});

function json(){
    $.get("https://jsonplaceholder.typicode.com/posts", function (data){
        console.log(data);
       document.getElementById("respuesta").innerHTML=JSON.stringify(data);
    });
}