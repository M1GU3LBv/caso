$(document).ready(function (){
    
});

function ajax(){
    const http = new XMLHttpRequest();
    const url = 'https://jsonplaceholder.typicode.com/posts/1';
    http.onreadystatechange = function (){
        if(this.readyState===4 && this.status === 200){
            var dd = JSON.parse(this.responseText);
            console.log(dd);
            document.getElementById("respuesta").innerHTML = "<h1>"+dd['title']+"</h1>";
        }
    }
    http.open("GET",url);
    http.send();
}
